<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/16 0016
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>文件上传</h1>
    <!--
    enctype 属性规定在发送到服务器之前应该如何对表单数据进行编码, 其值如下：
    1）application/x-www-form-urlencoded  在发送前编码所有字符（默认）
    2）multipart/form-data 不对字符编码，在使用包含文件上传控件的表单时，必须使用该值
    3）text/plain  空格转换为 "+" 加号，但不对特殊字符编码。
    -->
    <form action="<%=request.getContextPath()%>/upload" enctype="multipart/form-data" method="post">
        <input type="file" name="img" />
        <input type="submit" value="submit" />
    </form>

</body>
</html>
