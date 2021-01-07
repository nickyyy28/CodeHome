package web.login;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (Login_Verification.isExist(username,password)){
            resp.getWriter().write("登录成功");
        } else {
            resp.getWriter().write("登陆失败,请检查用户名或者密码");
        }

//        System.out.println(Login_Verification.isExist(username,password));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
