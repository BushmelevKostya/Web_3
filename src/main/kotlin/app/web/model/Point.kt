package app.web.model

import app.web.database.PointEntity
import app.web.service.PointService
import com.google.gson.Gson
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Named
import java.io.Serializable
import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

@Named("pointBean")
@ApplicationScoped
class Point : Serializable {
    private var x : Int = 0
    private var listOfX = ArrayList<Int>()
    private var y : Float = 0.0f
    private var r : Int = 1
    private var result : String = ""
    private val ps : PointService = PointService()
    private var field : Int = 0;
    init {
        listOfX.add(-7)
        listOfX.add(-6)
        listOfX.add(-5)
        listOfX.add(-4)
        listOfX.add(-3)
        listOfX.add(-2)
        listOfX.add(-1)
        listOfX.add(0)
        listOfX.add(1)
        listOfX.add(2)
        listOfX.add(3)
        listOfX.add(4)
        listOfX.add(5)
        listOfX.add(6)
        listOfX.add(7)
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
    fun getResult() : String {
        return result
    }
    fun setResult(result : String) {
        this.result = result
    }
    fun getField() : Int {
        return field
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
        val res = checkScope(x, y, r)
        return try {
            ps.saveEntity(x, y, r, res)
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
    fun getListResult() : String{
        return Gson().toJson(ps.getListResult())
    }
    private fun checkScope(x: Int, y: Float, r: Int) :String {
        var res = "No"
        var resCheck = false
        if (x >= 0 && y >= 0) resCheck = circle(x, y, r)
        else if (x <= 0 && y >= 0) resCheck = square(x, y, r)
        else if (x >= 0 && y <= 0) resCheck = triangle(x, y, r)
        if (resCheck) res = "Yes"
        return res
    }

    private fun triangle(x: Int, y: Float, r: Int): Boolean {
        return y >= x - r / 2
    }

    private fun circle(x: Int, y: Float, r: Int): Boolean {
        return y <= sqrt((r/2).toDouble().pow(2.0) - x.toDouble().pow(2.0))
    }

    private fun square(x: Int, y: Float, r: Int): Boolean {
        return x >= -r && y <= r
    }
    fun plusOne() {
        field += 1
    }
}