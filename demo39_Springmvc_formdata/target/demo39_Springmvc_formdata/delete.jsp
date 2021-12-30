<%--
  Created by IntelliJ IDEA.
  User: 闫鹏飞
  Date: 2021/12/25
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>批量删除</title>
</head>
<body>
    <form method="post" action="/user/deleteMore">
        <input type="checkbox" name="ids" value="1">
        <input type="checkbox" name="ids" value="2">
        <input type="checkbox" name="ids" value="3">
        <input type="checkbox" name="ids" value="4">
        <input type="checkbox" name="ids" value="5">
        <input type="checkbox" name="ids" value="6">
        <input type="checkbox" name="ids" value="7">
        <input type="submit" value="删除">

    </form>
</body>
</html>
