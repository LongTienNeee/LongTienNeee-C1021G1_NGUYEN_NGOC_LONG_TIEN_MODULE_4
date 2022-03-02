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
            <td><label><input type="checkbox" name="condiment" value="Lettuce">Lettuce</label></td>
            <td><label><input type="checkbox" name="condiment" value="Tomato">Tomato</label></td>
            <td><label><input type="checkbox" name="condiment" value="Mustard" >Mustard</label></td>
            <td><label><input type="checkbox" name="condiment" value="Sprouts">Sprouts</label></td>
            <td><label><input type="checkbox" name="condiment" value="Cucumber">Cucumber</label></td>
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
