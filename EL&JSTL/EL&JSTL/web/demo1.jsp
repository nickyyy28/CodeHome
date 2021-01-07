<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: 30929
  Date: 2020/11/13
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="500.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    ArrayList<String> list = new ArrayList<>();
    list.add("444");
    System.out.println(list);
    int i = 3/0;
%>

</body>
</html>
