package app.web.model

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
    fun setY(y : String) {
        this.y = y.toFloat()
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

    fun submit() {
//        println(1)
        try {
            println(x)
            println(y)
            println(r)
//            val ps = PointService()
//            ps.saveEntity(x, y, r)
        } catch (exception : Exception) {
            println(exception.message)
        }
    }
    fun print() : Int{
        return x
    }
}