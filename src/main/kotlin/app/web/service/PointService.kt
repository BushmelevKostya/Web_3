package app.web.service

import app.web.database.HibernateUtil
import app.web.database.PointEntity
import jakarta.transaction.Transactional

class PointService {
    fun saveEntity(x: Int, y: Float, r: Int) {
        val entityManager = HibernateUtil.entityManager
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

    fun print() {
        println(findEntityById(1))
    }

    fun findEntityById(entityId: Long): PointEntity? {
        val entityManager = HibernateUtil.entityManager
        return entityManager.find(PointEntity::class.java, entityId)
    }
}