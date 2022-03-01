<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/1/2022
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>This Sandwich</title>
</head>
<body>
<fieldset>
    <legend>Thông tin của Sandwich</legend>
    <table>
        <tr><td>Chiếc bánh Sandwich này có các popping :</td></tr>
        <tr>
            <td><c:forEach items="list" var="${list}">${list}</c:forEach></td>
        </tr>
    </table>

</fieldset>
</body>
</html>
