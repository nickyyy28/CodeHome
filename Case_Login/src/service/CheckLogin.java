package service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/checkLogin")
public class CheckLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        System.out.println("checkLogin 被访问了");
        //获取三个值,用户名,密码,验证码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String verificationCode = req.getParameter("verificationCode");

        //获取session中的真正验证码
        HttpSession session = req.getSession();
        Object realVerificationCode = session.getAttribute("verificationCode");


        //判断用户名,密码,验证码是否全部正确

        if (verificationCode.equals(realVerificationCode)) {
            System.out.println("验证码正确");
            //验证码正确
            if (Login_Verification.isExist(username, password)) {
                //账号密码正确
                System.out.println("账号密码正确!");
                resp.getWriter().write("<h1>欢迎您,"+username+"</h1>");
            } else {
                //账号密码错误
                resp.getWriter().write("<h1>账号密码存在错误!</h1>");
            }
        } else {
            //验证码错误
            resp.getWriter().write("<h1>验证码错误</h1>");
        }

    }
}
