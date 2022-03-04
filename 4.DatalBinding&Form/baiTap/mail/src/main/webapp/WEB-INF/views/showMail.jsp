<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/3/2022
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <th COLSPAN="2">Information mail</th>
        </tr>
        <tr>
            <td>Language</td>
            <td>${language}</td>
        </tr>
        <tr>
            <td>Page Size</td>
            <td>${pageSize}</td>
        </tr>
        <tr>
            <td>Spams Filter</td>
            <td>${spamsFilter}</td>
        </tr>
        <tr>
            <td>Signature</td>
            <td>${signature}</td>
        </tr>
    </table>
</body>
</html>
