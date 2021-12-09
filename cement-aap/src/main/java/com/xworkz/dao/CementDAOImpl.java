package com.xworkz.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.entity.Cement;

@Component
public class CementDAOImpl implements CementDAO {
	@Autowired
	private SessionFactory factory;

	public void addCement(Cement cement) {
		System.out.println("invoked add cement");
		Session session = null;
		try {
			// SessionFactory sessionFactory=new
			// Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			session.save(cement);
			session.getTransaction().commit();
			System.out.println("cement entity saved");

		} catch (HibernateException e) {
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}

	}

}
