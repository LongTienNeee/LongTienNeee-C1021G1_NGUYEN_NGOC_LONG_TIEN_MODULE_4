<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/2/2022
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Mail Form</title>
</head>
<body>
<fieldset>
    <legend>Setting</legend>
    <form:form modelAttribute="mail" action="/save" method="post">
        <table>
            <tr>
                <td><form:label path="language"><strong>Language</strong></form:label></td>
                <td><form:select path="language">
                    <option value="vietnamese">Tiếng Việt</option>
                    <option value="english">Tiếng Anh</option>
                    <option value="japanese">Tiếng Nhật</option>
                    <option value="chinese">Tiếng Trung</option>
                </form:select></td>
            </tr>
            <tr>
                <td><form:label path="pageSize"><Strong>Page Size</Strong></form:label></td>
                <td><form:select path="pageSize">
                    <option value="5">5</option>
                    <option value="10">10</option>
                    <option value="15">15</option>
                    <option value="25">25</option>
                    <option value="50">50</option>
                    <option value="100">100</option>
                </form:select></td>
            </tr>
            <tr>
                <td><form:label path="spamsFilter"><strong>Spams Filter</strong></form:label></td>
                <td><form:checkbox value="" path="spamsFilter"/>Enable spams filter</td>
            </tr>
            <tr>
                <td><form:label path="signature"><strong>Signature</strong></form:label></td>
                <td><form:textarea path="signature"></form:textarea></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Update">
                    <input type="reset" value="Cancel">
                </td>
            </tr>
        </table>
    </form:form>
</fieldset>
</body>
</html>
