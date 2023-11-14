package app.web.database

import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence

object HibernateUtil {
    private const val PERSISTENCE_UNIT_NAME = "PointData"
    private var entityManagerFactory: EntityManagerFactory

    init {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
        } catch (ex: Throwable) {
            System.err.println("Initial EntityManagerFactory creation failed.$ex")
            throw ExceptionInInitializerError(ex)
        }
    }

    val entityManager: EntityManager
        get() = entityManagerFactory.createEntityManager()

    fun closeEntityManagerFactory() {
        if (entityManagerFactory.isOpen) {
            entityManagerFactory.close()
        }
    }
}