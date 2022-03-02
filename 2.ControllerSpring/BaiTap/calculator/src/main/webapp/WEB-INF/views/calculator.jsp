<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/2/2022
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<fieldset>
    <legend>Calculator</legend>
    <form action="/calculate" method="post">
        <table>
            <th colspan="4">Casio</th>
            <tr>
                <td colspan="2"><input type="text" name="value1" id="value1"></td>
                <td colspan="2"><input type="text" name="value2" id="value2"></td>
                <td>Result = ${result}
                    <p style="color: red">${error}</p></td>
            </tr>
            <tr>
                <td><input type="submit" name="button" value="+"></td>
                <td><input type="submit" name="button" value="-"></td>
                <td><input type="submit" name="button" value="*"></td>
                <td><input type="submit" name="button" value="/"></td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
