<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/2/2022
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Information Employee</title>
</head>
<body>
<fieldset>
    <legend>Information Employee</legend>
    <table>
        <tr>
            <td>ID:</td>
            <td>${id}</td>
        </tr>
        <tr>
            <td>Name:</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>Contact Number :</td>
            <td>${contactNumber}</td>
        </tr>
    </table>
</fieldset>

</body>
</html>
