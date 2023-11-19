package app.web.service

import app.web.database.HibernateUtil
import app.web.database.PointEntity
import jakarta.persistence.criteria.CriteriaBuilder
import org.hibernate.Session


class PointService {
    private val hibernate = HibernateUtil()
    private var pointList = ArrayList<PointEntity>()
    fun saveEntity(x: Int, y: Float, r: Int) {
        val entityManager = hibernate.getEntityManager()
        val entity = PointEntity()
        entity.x = x
        entity.y = y
        entity.r = r

        val transaction = entityManager.transaction
        transaction.begin()

        entityManager.persist(entity)
        transaction.commit()
        entityManager.close()

        pointList.add(entity)
    }

    fun getPoints() : ArrayList<PointEntity> {
        val entityManager = hibernate.getEntityManager()
        val jpql = "SELECT p FROM PointEntity p"
        val query = entityManager.createQuery(jpql, PointEntity::class.java)

        val list = query.resultList
        val point_list = ArrayList<PointEntity>()
        for (point in list) {
            point_list.add(point)
        }
        entityManager.close()
        return point_list;
    }
    fun findEntityById(entityId: Long): PointEntity? {
        val entityManager = hibernate.getEntityManager()
        return entityManager.find(PointEntity::class.java, entityId)
    }
}