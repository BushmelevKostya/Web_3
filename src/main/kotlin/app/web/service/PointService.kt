package app.web.service

import app.web.database.HibernateUtil
import app.web.database.PointEntity

class PointService {
    private val hibernate = HibernateUtil()
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
    }

    fun findEntityById(entityId: Long): PointEntity? {
        val entityManager = hibernate.getEntityManager()
        return entityManager.find(PointEntity::class.java, entityId)
    }
}