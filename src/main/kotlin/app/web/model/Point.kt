package app.web.model

import app.web.database.PointEntity
import app.web.service.PointService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Named
import java.io.Serializable
import java.lang.Exception

@Named("pointBean")
@ApplicationScoped
class Point : Serializable {
    private var x : Int = 0
    private var listOfX = ArrayList<Int>()
    private var y : Float = 0.0f
    private var r : Int = 1
    private val ps : PointService = PointService()
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
    fun getY() : Float {
        return y
    }
    fun setY(y : Float) {
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

    fun submit() : ArrayList<PointEntity>{
        return try {
            ps.saveEntity(x, y, r)
            ps.getPoints()
        } catch (exception : Exception) {
            println(exception.message)
            ArrayList<PointEntity>()
        }
    }
    fun getPoints() : ArrayList<PointEntity> {
        return ps.getPoints()
    }

    fun getListX() : List<Int> {
        return ps.getListX()
    }
    fun getListY() : List<Float>{
        return ps.getListY()
    }
    fun getListR() : List<Int>{
        return ps.getListR()
    }
}