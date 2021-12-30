<%--
  Created by IntelliJ IDEA.
  User: 闫鹏飞
  Date: 2021/12/25
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <form method="post" action="/user/register2">
        用户名:<input type="text" name="username"><br>
        密码:<input type="text" name="password"><br>
        昵称:<input type="text" name="nickname"><br>
        生日:<input type="text" name="birthday"><br>
        爱好:<input type="checkbox" name="hobbies" value="篮球">篮球
        <input type="checkbox" name="hobbies" value="足球">足球
        <input type="checkbox" name="hobbies" value="羽毛球">羽毛球
        <input type="checkbox" name="hobbies" value="乒乓球">乒乓球
        <input type="submit" value="注册">
    </form>
</body>
</html>
