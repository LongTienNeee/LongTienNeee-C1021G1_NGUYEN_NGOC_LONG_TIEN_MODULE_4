<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/2/2022
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login Page</title>
    <style>
        #loginButton{
            width: 50px;
            height: 50px;
        }
    </style>
</head>
<body>
<fieldset>
    <legend>Login</legend>
    <form:form action="login" method="post" modelAttribute="login">
        <table>
            <tr>
                <td><form:label path="account">Account : </form:label></td>
                <td><form:input path="account"/></td>
                <td rowspan="2"><input type="submit" value="Login" id="loginButton"></td>
            </tr>
            <tr>
                <td><form:label path="password">Password : </form:label></td>
                <td><form:password path="password"/></td>

            </tr>
        </table>
    </form:form>
</fieldset>

</body>
</html>
