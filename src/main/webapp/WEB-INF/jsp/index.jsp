<%@ page contentType="text/html; utf-8"%>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags"%>
<html>
<body>
<h2>系统首页 </h2>
<ul>
    <li><img src="<%=request.getContextPath()%>/static/images/1.jpg"></li>

    <a href="<%=request.getContextPath()%>/i18n/change"><t:message code="language"/></a>

    <li><a href="<%=request.getContextPath()%>/students/add"><t:message code="stu.add"/></a></li>
    <li><a href="<%=request.getContextPath()%>/students/update?sid=6" ><t:message code="stu.upate"/></a></li>
    <li><a href="<%=request.getContextPath()%>/uploadPage"><t:message code="upload"/></a></li>

</ul>
</body>
</html>