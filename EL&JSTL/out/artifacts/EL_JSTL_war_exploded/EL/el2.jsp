<%--
  Created by IntelliJ IDEA.
  User: 30929
  Date: 2020/11/15
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        request.setAttribute("name","张三");
    %>

    ${requestScope.name}

</body>
</html>
