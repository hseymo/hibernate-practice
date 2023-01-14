package com.skillstorm.hibernate.data;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.skillstorm.hibernate.beans.Trainee;

public class TraineeDAO {

	public void save(Trainee tr) {
		Session session = HibernateFactory.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			Serializable id = session.save(tr);
			tx.commit();
			System.out.println("saved record " + id);
		} catch(org.hibernate.exception.ConstraintViolationException e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		session.close();
		
	}
}
