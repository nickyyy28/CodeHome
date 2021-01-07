<%@ page import="Member.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: 30929
  Date: 2020/11/15
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        User user = new User("张三",18,new Date());
        session.setAttribute("user",user);

        ArrayList<User> arrayList = new ArrayList<>();

        arrayList.add(new User("nick",18,new Date()));
        arrayList.add(new User("pitty",25,new Date()));
        arrayList.add(new User("calaned",21,new Date()));

        session.setAttribute("arrayList",arrayList);


        Map<String,User> map = new HashMap<>();

        map.put("aaa",new User("nick",18,new Date()));
        session.setAttribute("map",map);
    %>

<%--    ${sessionScope.user.birthday.year}--%>
    ${sessionScope.user.birStr}<br>

    <h3>获取List的值</h3>

    ${arrayList[0].name}<br>
    ${arrayList[0].age}<br>
    ${arrayList[0].birStr}<br>
    ${arrayList[0].birthday}<br>

    <h3>获取Map的值</h3>
    ${map.get("aaa").birStr}<br>

    <%
        String str = "123456";
        String str2 = null;
        request.setAttribute("str",str);
        request.setAttribute("str2",str2);
    %>

    <h3>empty 运算符</h3>
    ${empty str}<br>
    ${empty str2}<br>
</body>

</html>
