package com.xworkz.vaccine.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.vaccine.entity.UserSignUpEntity;
import com.xworkz.vaccine.service.SingUpService;
@Repository
public class SignUpDAOImpl implements SignUpDAO {

	@Autowired
	private SessionFactory factory;
	

	public SignUpDAOImpl() {
		System.out.println(this.getClass().getSimpleName()+"created");
		
	}
	@Override
	public boolean saveUserSignUpEntity(UserSignUpEntity usersignupEntity) {
		System.out.println("Invoked saveUsersSignUpEntity");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(usersignupEntity);
			session.getTransaction().rollback();
			System.out.println("userSignUpEntity is saved");
			return true;
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println("Transaction is roll back");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is close");
			} else {
				System.out.println("session is not closed");
			}
		}
		return false;
	}
	@Override
	public String getPassword(String email) {
		System.out.println("Invoked getPassword");
		Session session = null;
		try {
			session = factory.openSession();
			org.hibernate.query.Query query = session.getNamedQuery("UserSignUpEntity.getpasswordbyEmail");
			query.setParameter("emailId", email);	
			String password = (String) query.uniqueResult();
			session.getTransaction().commit();
		System.out.println("password" + password);
			return password;
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println("Transaction roll back");
		}finally {
			if(session !=null) {
				session.close();
				System.out.println("Session is closed");
			}else {
				System.out.println("Session is not closed");

			}
		
		}
		return null;
	}

}
