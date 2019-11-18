<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/14 0014
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <f:form action="${ctx}/students/update" modelAttribute="student" method="post">
        学号：<f:input path="sid"></f:input><f:errors path="sid"/> </br>
        姓名：<f:input path="sname"></f:input><f:errors path="sname"/> </br>
        年龄：<f:input path="age"></f:input><f:errors path="age"/> </br>
        备注：<f:textarea path="remark"></f:textarea> </br>
        <input type="submit" value="提交">
    </f:form>
</p>
</body>
</html>
