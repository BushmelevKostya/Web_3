package app.web.service

import app.web.database.HibernateUtil
import app.web.database.PointEntity

class PointService {
    private val hibernate = HibernateUtil()
    private var pointList = ArrayList<PointEntity>()
    fun saveEntity(x: Int, y: Float, r: Int, result: String) {
        val entityManager = hibernate.getEntityManager()
        val entity = PointEntity()
        entity.x = x
        entity.y = y
        entity.r = r
        entity.result = result

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
        this.pointList = point_list
        return point_list;
    }

    fun getListX(): List<Int> {
        val listX = mutableListOf<Int>()
        for (point in pointList) {
            listX.add(point.x)
        }
        return listX
    }

    fun getListY(): List<Float> {
        val listY = mutableListOf<Float>()
        for (point in pointList) {
            listY.add(point.y)
        }
        return listY
    }
    fun getListR(): List<Int> {
        val listR = mutableListOf<Int>()
        for (point in pointList) {
            listR.add(point.r)
        }
        return listR
    }
    fun getListResult(): List<String> {
        val listResult = mutableListOf<String>()
        for (point in pointList) {
            listResult.add(point.result)
        }
        return listResult
    }
    fun findEntityById(entityId: Long): PointEntity? {
        val entityManager = hibernate.getEntityManager()
        return entityManager.find(PointEntity::class.java, entityId)
    }
}