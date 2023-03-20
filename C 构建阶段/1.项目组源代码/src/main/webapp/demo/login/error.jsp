<%--
  Created by IntelliJ IDEA.
  User: jianji_love
  Date: 2022/7/18
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>错误页面</title>
</head>
<body>
<div><a href="../login/login.html">登录</a> </div>
<div><a href="../login/register.html">注册</a> </div>
<%
    String message = request.getParameter("message");
    out.print(message);
%>
</body>
</html>
