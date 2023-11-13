package app.web.database

import app.web.model.Point
import jakarta.enterprise.context.ApplicationScoped
import jakarta.faces.component.FacesComponent
import jakarta.inject.Named
import jakarta.persistence.EntityManager
import jakarta.transaction.Transactional
@FacesComponent
@Named("databaseBean")
@ApplicationScoped
class DatabaseBean {
    private lateinit var entityManager : EntityManager

    @Transactional
    fun saveEntity(point : Point) {
        entityManager.persist(point)
    }
    fun findEntityById(entityId : Long) : Point? {
        return entityManager.find(Point::class.java, entityId)
    }
}