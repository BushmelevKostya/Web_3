package app.web.database

import jakarta.persistence.*

@Table(name = "points")
@Entity
class PointEntity {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    @Column(name = "x")
    var x: Int = 0
    @Column(name = "y")
    var y: Float = 0.0f
    @Column(name = "r")
    var r: Int = 0

    fun getId() : Long?{
        return id
    }
    fun setX(value: Int) {
        this.x = value
    }
    fun getX() : Int{
        return x
    }
    fun setY(value: Float) {
        this.y = value
    }
    fun getY() : Float {
        return y
    }
    fun setR(value: Int) {
        this.r = value
    }
    fun getR() : Int{
        return r
    }
}