<%--
  Created by IntelliJ IDEA.
  User: 30929
  Date: 2020/11/8
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width , initial-scale=1">
    <title>Title</title>
    <script src="./js/jquery-3.2.1.min.js"></script>
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <script src="./js/bootstrap.min.js"></script>
    <script>



        window.onload = function () {
            var login = document.getElementById("login");
            login.onclick = function () {

            }

            var pic = document.getElementById("pic");
            pic.src = "/login/verification";
            pic.onclick = function () {
                var time = new Date().getTime();
                pic.src = "/login/verification?" + time;
            }
        }
    </script>

    <style>
        #form {

        }

        #pic, verificationCode {
            float: left;
        }
    </style>
</head>
<body>

    <div class="container ">
        <form action="checkLogin" method="post" id="form">
            <label for="name">用户名</label><input type="text" id="name" placeholder="请输入用户名" name="username"><br>
            <label for="password">密码</label> <input type="password" id="password" placeholder="请输入密码" name="password"><br>
            <label for="verificationCode"><input type="text" id="verificationCode" placeholder="请输入验证码"
                                                 name="verificationCode">
            </label>
            <img src="login/verification" id="pic">
            <br>
            <input type="submit" value="登录" id="login">
        </form>
    </div>

</body>
</html>
