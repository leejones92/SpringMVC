<%--
  Created by IntelliJ IDEA.
  User: liyang
  Date: 2017/10/22
  Time: 下午10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>非Restful 风格jsp</title>
</head>
<body>
    <form action="/notRestfulReq.action" method="post">
        <input type="text" name="name">
        <input type="submit" value="提交">
    </form>

    <a href="/notRestfulReq/zhangsan">张三</a>
</body>
</html>
