package com.xworkz.vaccine.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.vaccine.entity.UserOTPEntity;
import com.xworkz.vaccine.service.RegisterService;

@Repository
public class OTPDAOImpl implements OTPDAO {
	@Autowired
	private SessionFactory factory;
	@Autowired
	private  RegisterService registerService;

	public OTPDAOImpl() {
		System.out.println(this.getClass().getSimpleName() + "created");

	}

	public boolean saveUserOTPEntity(UserOTPEntity userOTPEntity) {
		System.out.println("Invoked saveOTPEntity()");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(userOTPEntity);
			session.getTransaction().commit();
			System.out.println("userOTPEntity is saved");
			return true;
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println("Transaction is roll back");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is close");
			} else {
				System.out.println("session is not close");
			}
		}
		return false;
	}

	@Override
	public int getOTPDAOByEmail(String email) {
		System.out.println("Invoked getOTPDAOByEmail()");
		Session session = null;
		try {
			session = factory.openSession();
			org.hibernate.query.Query query = session.getNamedQuery("UserOTPEntity.getotpbyEmail");
			query.setParameter("emailId", email);
			
			Integer otp = (Integer) query.uniqueResult();
		
			System.out.println("Found Email" + otp);
			if (otp != null) {
				return otp;
			} else {
				System.out.println("Email not Found");

			}
		} catch (HibernateException e) {
			System.out.println("Email not Found");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is close");
			} else {
				System.out.println("session is not close");
			}
		}
		return 0;
	}

	@Override
	public boolean updateOTPByEmail(String email,int newotp) {
		System.out.println("Invoked updateOTPByEmail()");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			org.hibernate.query.Query query = session.getNamedQuery("UserOTPEntity.updateOTPByEmail");
			
			query.setParameter("emailId", email);
			query.setParameter("newotp", registerService.getOTP());
			
			int update = query.executeUpdate();
			System.out.println("chek new otp");
			session.getTransaction().commit();
			System.out.println("updated" + update);
			return true;

		} catch (HibernateException e) {
			System.out.println("session is rolled back");
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return false;
	}

}
