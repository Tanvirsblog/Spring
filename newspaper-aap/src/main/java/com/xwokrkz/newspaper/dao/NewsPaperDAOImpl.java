package com.xwokrkz.newspaper.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.newspaper.aap.dto.NewsPaperDTO;
import com.xworkz.newspaper.entity.NewsPaperEntity;
@Component
public class NewsPaperDAOImpl implements NewsPaperDAO {

	@Autowired
	private SessionFactory factory;

	public NewsPaperDAOImpl() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}
	public boolean saveNewsPaperEntity(NewsPaperEntity newsPaperEntity) {
		System.out.println("InvokedsaveNewsPaperEntity()");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(newsPaperEntity);
			session.getTransaction().commit();
			System.out.println("newsPaper Entity saved");
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

	public NewsPaperEntity getNewsPaperEntity(String newsPaperName) {
		System.out.println("Invoked getNewsPaperEntity()");
		Session session = null;
		try {
			session = factory.openSession();
			Query query = session.getNamedQuery("");
			query.setParameter("name", newsPaperName);
			NewsPaperEntity entity = (NewsPaperEntity) query.uniqueResult();
			System.out.println(" found newsPaperName" + entity);
			return entity;
		} catch (HibernateException e) {
			System.out.println("inside catch block");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is close");
			} else {
				System.out.println("session is not close");
			}
			return null;
		}
	}
}
