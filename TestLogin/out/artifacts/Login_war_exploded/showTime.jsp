<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: 30929
  Date: 2020/10/27
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showTime</title>
</head>
<body>
    <h1>
        <%
            response.setContentType("text/html;charset=utf-8");
            Cookie[] cookies = request.getCookies();
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
                response.addCookie(cookie);
                response.getWriter().write("<h1>"+"上一次访问是:"+ URLDecoder.decode(time,"utf-8")+"</h1>");
            } else {
                Cookie cookie1 = new Cookie("lastTime", URLEncoder.encode(format, "utf-8"));
//            cookie1.setMaxAge(60 * 60 * 24 * 30);
                cookie1.setMaxAge(30);
                response.addCookie(cookie1);
                response.getWriter().write("<h1>这是您第一次访问</h1>");

            }
        %>



    </h1>
</body>
</html>
