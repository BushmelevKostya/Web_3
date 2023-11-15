package app.web.database

import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence

class HibernateUtil() {
    private var entityManagerFactory : EntityManagerFactory = Persistence.createEntityManagerFactory("PointData")
    fun getEntityManager() : EntityManager {
        return entityManagerFactory.createEntityManager()
    }

    fun closeEntityManagerFactory() {
        if (entityManagerFactory.isOpen) {
            entityManagerFactory.close()
        }
    }
}