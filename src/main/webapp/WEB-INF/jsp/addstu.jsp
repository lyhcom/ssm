<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/14 0014
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <%
    request.setAttribute("ctx",request.getContextPath());
    %>
</head>
<body>
    <h1>新增学员</h1>
    <p>
        年级：
        <select>
            <c:forEach items="${requestScope.grades}" var="grade">
                <option value="${grade}">${grade}</option>
            </c:forEach>
        </select>
    </p>
    ---------------------------------
    <p>
        <!--
        此处的f:input path="xx" 有两个作用：
        1）提交时作为表单元素提交
        2）显示modelAttribute属性指定的对象的属性值，modelAttribute属性指定的对象名称在Controller中通过Model对象
           带给页面作用域，若在Controller中没有对应的设置，则页面会报错，此处可以与Controller结合起来理解。
        -->
        <f:form action="${ctx}/students/add" modelAttribute="student" method="post">
            <%--添加时不需要sid属性--%>
            <%--学号：<f:input path="sid"></f:input> </br>--%>
            姓名：<f:input path="sname"></f:input> </br>
            年龄：<f:input path="age"></f:input> </br>
            备注：<f:textarea path="remark"></f:textarea> </br>
            <input type="submit" value="提交">
        </f:form>
    </p>

</body>
</html>
