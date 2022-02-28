<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/28/2022
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary VN-UK</title>
</head>
<body>
<fieldset>
    <legend>Search Word</legend>
    <form action="/word" method="post">
        <table>
            <tr>
                <td>Word:</td>
                <td><input type="text" name="word" value="Enter word"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Search"></td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
