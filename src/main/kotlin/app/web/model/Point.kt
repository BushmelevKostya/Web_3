package app.web.model

import app.web.database.PointEntity
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Named
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import jakarta.transaction.Transactional
import java.io.Serializable

@Named("pointBean")
@ApplicationScoped
class Point : Serializable {
    private var x : Int = 0
    private var listOfX = ArrayList<Int>()
    private var y : String = ""
    private var r : Int = 1
    @PersistenceContext(unitName = "PointData")
    private lateinit var entityManager: EntityManager
    init {
        listOfX.add(-4)
        listOfX.add(-3)
        listOfX.add(-2)
        listOfX.add(-1)
        listOfX.add(0)
        listOfX.add(1)
        listOfX.add(2)
        listOfX.add(3)
        listOfX.add(4)
    }

    fun getX() : Int {
        return x;
    }
    fun setX(x : Int) {
        this.x = x
    }
    fun getY() : String {
        return y
    }
    fun setY(y : String) {
        this.y = y
    }
    fun getR() : Int {
        return r
    }
    fun setR(r : Int) {
        this.r = r
    }
    fun getListOfX() : ArrayList<Int> {
        return listOfX
    }
    fun setListOfX(value : ArrayList<Int>) {
        this.listOfX = value
    }
    fun printR() {
        println("R: $r")
    }

    @Transactional
    fun saveEntity(x: Int, y: Float, r: Int) {
        val entity = PointEntity(x, y, r)
        entityManager.persist(entity)
    }
    fun findEntityById(entityId : Long) : PointEntity? {
        return entityManager.find(PointEntity::class.java, entityId)
    }

    fun submit() {
        saveEntity(x, y.toFloat(), r)
    }
}