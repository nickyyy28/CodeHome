package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/requestdemo2")
public class requestdemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        System.out.println(username);
        req.setCharacterEncoding("utf-8");
        Enumeration<String> names = req.getParameterNames();
        String name;
        while (names.hasMoreElements()){
            name = names.nextElement();
            String value = req.getParameter(name);
            System.out.println(name);
            System.out.println(value);
            System.out.println("----------------------");
        }

    }
}
