package app.web

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@WebServlet(name = "ControllerServlet", value = ["/controller"])
class ControllerServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        delegate(req, resp)
    }

    override fun doPost(req: HttpServletRequest?, resp: HttpServletResponse?) {
        delegate(req, resp)
    }

    private fun delegate(req: HttpServletRequest?, resp: HttpServletResponse?) {
        val names = req?.parameterNames
        println(names)
    }
}