<%--
  Created by IntelliJ IDEA.
  User: 30929
  Date: 2020/11/8
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>欢迎您,<%=request.getSession().getAttribute("username")%></h1>
</body>
</html>
