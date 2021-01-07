package web.login;

import objects.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

//@WebServlet("/testbean")
public class TestBean extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Map<String, String[]> map = req.getParameterMap();
//        User loginuser = new User();
//
//        try {
//            BeanUtils.populate(loginuser,map);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(loginuser);
//    }
}
