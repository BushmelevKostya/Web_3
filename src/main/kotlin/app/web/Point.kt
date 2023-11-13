package app.web

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Named
import java.io.Serializable

@Named("xBean")
@ApplicationScoped
class Point : Serializable {
    val x : Int = 0
    var listOfX = ArrayList<Int>()

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

    fun submit() {
        println("Selected Fruit: $x")
    }
}