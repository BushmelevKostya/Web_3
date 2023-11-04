package app.web

import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.context.RequestScoped
import jakarta.enterprise.context.SessionScoped
import jakarta.inject.Named
import java.io.Serializable

@Named("calculator")
@ApplicationScoped
class Calculator : Serializable {
    var firstNumber  = 0
    var res = 0
    var secondNumber = 0

    fun add() {
        res = firstNumber + secondNumber
    }

    fun multiply() {
        res = firstNumber * secondNumber
    }

    fun clear() {
        res = 0
        res = 1
    }

    fun submit(): String {
        return "response.xhtml"
    }
}