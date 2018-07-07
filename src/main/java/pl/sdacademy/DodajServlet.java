package pl.sdacademy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// 20180707 so
public class DodajServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    protected void doPost(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println((Integer.parseInt(reqest.getParameter("p1"))+Integer.parseInt(reqest.getParameter("p2"))));
    }


    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }
}
