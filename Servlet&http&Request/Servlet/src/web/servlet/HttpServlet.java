package web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doSomething")
public class HttpServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("doGet");
        System.out.println(req);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("doPost");
        String path = req.getContextPath();
        String servletPath = req.getServletPath();
        String requestURI = req.getRequestURI();
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
        System.out.println(requestURI);
        System.out.println(servletPath);
        System.out.println(path);
    }
}
