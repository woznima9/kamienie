package pl.sdacademy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// 20180707 so
// checking 2018-10-15
public class DodajServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    protected void doPost(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");  //jesli tego nie będzie href 2 liie niżej nie zadziała i tylko się wyświetli jako text
        response.getWriter().println((Integer.parseInt(reqest.getParameter("p1"))+Integer.parseInt(reqest.getParameter("p2"))));
        response.getWriter().println("<p><a href=\"kamienie.html\">Przejdz do kamienie.html (młódź)</a></p>");
//        response.sendRedirect("/draft/kamienie.html");
    }


    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }
}
