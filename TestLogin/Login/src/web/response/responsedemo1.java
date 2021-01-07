package web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/responsedemo1")
public class responsedemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("这是demo1");
        //跳转到其他Servlet上
//        req.getRequestDispatcher("/responsedemo2").forward(req,resp);
//        resp.setStatus(302);
//        resp.setHeader("location","/login/responsedemo2");

        //简单的重定向
        resp.sendRedirect("/login/responsedemo2");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
