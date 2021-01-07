package web.TestCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/testcookie")
public class testCookie extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = req.getCookies();
        String time = null;
        Cookie cookie = null;
        boolean isExist = false;
        if (cookies != null && cookies.length > 0){
            for (Cookie c : cookies){
                String name = c.getName();
                if ("lastTime".equals(name)){
                    isExist = true;
                    time = c.getValue();
                    cookie = c;
                }
            }
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(date);

        if (isExist){

            cookie.setValue(URLEncoder.encode(format,"utf-8"));
//            cookie.setMaxAge(60 * 60 * 24 * 30);
            cookie.setMaxAge(30);
            resp.addCookie(cookie);
            resp.getWriter().write("<h1>"+"上一次访问是:"+ URLDecoder.decode(time,"utf-8")+"</h1>");
        } else {
            Cookie cookie1 = new Cookie("lastTime", URLEncoder.encode(format, "utf-8"));
//            cookie1.setMaxAge(60 * 60 * 24 * 30);
            cookie1.setMaxAge(30);
            resp.addCookie(cookie1);
            resp.getWriter().write("<h1>这是您第一次访问</h1>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
