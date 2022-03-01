<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/1/2022
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<form action="/save">
    <table>
        <th colspan="5">Sandwich Condiments</th>
        <tr>
            <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
            <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
            <td><input type="checkbox" name="condiment" value=Mustard"" >Mustard</td>
            <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
            <td><input type="checkbox" name="condiment" value="Cucumber">Cucumber</td>
        </tr>
        <tr>
            <td><hr></td>
            <td><hr></td>
            <td><input type="submit" value="Save" style="width: 75px"></td>
            <td><hr></td>
            <td><hr></td>

        </tr>
    </table>
</form>

</body>
</html>
