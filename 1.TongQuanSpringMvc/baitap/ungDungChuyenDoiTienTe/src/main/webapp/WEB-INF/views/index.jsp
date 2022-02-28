<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/28/2022
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Change Money</title>
  </head>
  <body>
  <fieldset>
    <legend>Change Money</legend>
    <form action="/usd" method="post">
      <table>
        <tr>
          <td>USD</td>
          <td><input type="text" name="usd" id="usd" placeholder="Enter USD $$$"></td>
        </tr>
        <tr>
          <td>Rate</td>
          <td><input type="text" name="rate" id="rate"></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="Change"></td>
        </tr>
      </table>
    </form>
  </fieldset>
  
  </body>
</html>
