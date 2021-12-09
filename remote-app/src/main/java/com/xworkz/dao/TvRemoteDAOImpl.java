package com.xworkz.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.remote.entity.TvRemoteEntity;

@Component
public class TvRemoteDAOImpl implements TvRemoteDAO {
	@Autowired
	private SessionFactory factory;

	@Override
	public void addTvRemoteEntity(TvRemoteEntity tvRemoteEntity) {
		System.out.println("invoked TvRemoteEntoty");
		Session session = null;
		try {

			session = factory.openSession();
			session.beginTransaction();
			session.save(tvRemoteEntity);
			session.getTransaction().commit();
			System.out.println("tvRemoteEntity is saved");

		} catch (HibernateException e) {
			System.out.println("Transaction failed rolling back");
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
