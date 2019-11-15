<%@ page contentType="text/html; utf-8"%>
<%@ page pageEncoding="utf-8"%>
<html>
<body>
<h2>系统首页 </h2>
<ul>
    <li><a href="<%=request.getContextPath()%>/students/add" >新增学员</a></li>
    <li><a href="<%=request.getContextPath()%>/students/update?sid=6" >修改学员</a></li>
</ul>
</body>
</html>