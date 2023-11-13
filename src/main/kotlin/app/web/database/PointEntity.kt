package app.web.database

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class PointEntity(val x: Int, val y: Float,val r: Int) {
    constructor() : this(0, 0.0f, 0) {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}