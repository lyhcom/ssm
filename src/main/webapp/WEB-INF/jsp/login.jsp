<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/24 0024
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>登录页面</h1>
    ${message}
    <form id="loginForm" action="<%=request.getContextPath()%>/user/login" method="post">
        <input type="text" id="username" name="username"/>
        <input type="text" id="password" name="password"/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
