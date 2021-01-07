package login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Login_Verification login_verification = new Login_Verification();
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        boolean isExist = Login_Verification.isExist(username, password);
//        if (isExist){
//            System.out.println("登录成功!");
//        } else {
//            System.out.println("用户名或密码错误");
//        }
//        System.out.println(username+password);
        System.out.println(login_verification.isExist("zhangsanfeng","123456"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
