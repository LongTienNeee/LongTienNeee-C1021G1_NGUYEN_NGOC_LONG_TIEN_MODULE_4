<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/1/2022
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kiểm tra Email Hợp Lệ</title>
</head>
<body>
<fieldset>
    <legend>Kiểm tra email</legend>
    <form action="/validate" method="post">
        <table>
            <td><input type="text", name="email" id="email"></td>
            <td><input type="submit" value="Check"></td>
        </table>
    </form>
</fieldset>
</body>
</html>
