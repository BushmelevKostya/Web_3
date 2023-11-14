package app.web.service;

import app.web.database.HibernateUtil;
import app.web.database.PointEntity;
import app.web.model.Point;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PointService {
	public void saveEntity(int x, float y, int r) {
		EntityManager entityManager = HibernateUtil.getEntityManager();
		PointEntity point = new PointEntity();
		point.setX(x);
		point.setY(y);
		point.setR(r);
		entityManager.persist(point);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		entityManager.persist(point);
		transaction.commit();
		entityManager.close();
		System.out.println(1);
	}
}
