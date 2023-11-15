import app.web.database.HibernateUtil;
import app.web.database.PointEntity;
import app.web.model.Point;
import app.web.service.PointService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Main {
	public static void main(String[] args) {
		try {
			//работает
			Point point = new Point();
			point.submit();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
//		PointService pointService = new PointService();
//		pointService.saveEntity(1,2,2);
//		HibernateUtil hibernate = new HibernateUtil();
//		EntityManager entityManager = hibernate.getEntityManager();
//		PointEntity point = new PointEntity();
//		point.setX(1);
//		point.setY(1);
//		point.setR(2);
//		entityManager.persist(point);
//
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//
//		entityManager.persist(point);
//		transaction.commit();
//		entityManager.close();
//		System.out.println(1);
	}
}
