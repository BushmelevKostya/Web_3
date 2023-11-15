package app.web.model

import app.web.service.PointService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.faces.view.ViewScoped
import jakarta.inject.Named
import java.io.Serializable

@Named("pointBean")
@ApplicationScoped
class Point : Serializable {
    private var x : Int = 0
    private var listOfX = ArrayList<Int>()
    private var y : String = ""
    private var r : Int = 1
    private val ps = PointService()
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

    fun submit() {
        println(1)
//        ps.saveEntity(x, y.toFloat(), r)
    }
}