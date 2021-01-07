package utils;


import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/verification")
public class verificationCodeUtil extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //用session控制
        HttpSession session = req.getSession();
//        Object verificationCode = session.getAttribute("verificationCode");


//        Cookie[] cookies = req.getCookies();
//        Cookie cookie = null;
//        boolean isCookieExist = false;
//        for ( Cookie c : cookies ){
//            if ("verificationCode".equals(c.getName())){
//                isCookieExist = true;
//                cookie = c;
//            }
//        }
        int width = 100;
        int height = 32;
        BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);


        //获取画笔工具

        Graphics g = bi.getGraphics();

        //设置背景色
        g.setColor(Color.pink);
        g.fillRect(0,0,width,height);

        //设置边框
        g.setColor(Color.blue);
        g.drawRect(0,0,width-1,height-1);

        //添加字符串
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&1234567890abcdefghijklmnopqrstuvwxyz";
        //随机生成
        String s = RandomStringUtil.getRandomString(str);
        g.drawChars(s.toCharArray(),0,s.length(),20,16);

        //画线
        g.setColor(Color.GREEN);

        for (int i = 0; i < 10; i++) {
            g.drawLine(new Random().nextInt(width) , new Random().nextInt(height) , new Random().nextInt(width) , new Random().nextInt(height));
        }

        ImageIO.write(bi,"jpg", resp.getOutputStream());

//        if (isCookieExist){
//            cookie.setValue(s);
//        } else {
//            cookie = new Cookie("verificationCode",s);
//        }
//        cookie.setMaxAge(60 * 5);
//        resp.addCookie(cookie);
//        System.out.println(cookie.getValue());


        session.setAttribute("verificationCode",s);
        System.out.println(s);

    }
}
