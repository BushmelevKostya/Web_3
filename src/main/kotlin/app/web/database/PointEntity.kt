package app.web.database

import jakarta.persistence.*

@Table(name = "points")
@Entity
class PointEntity {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    @get:Column(name = "x")
    var x: Int = 0
    @get:Column(name = "y")
    var y: Float = 0.0f
    @get:Column(name = "r")
    var r: Int = 0
}