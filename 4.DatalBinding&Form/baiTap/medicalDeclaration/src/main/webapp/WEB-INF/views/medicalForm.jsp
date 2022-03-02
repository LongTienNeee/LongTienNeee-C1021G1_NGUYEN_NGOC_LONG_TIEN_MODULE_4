<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/2/2022
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Tờ Khai Y Tế</title>
    <style>
        .head{
            text-align: center;
        }
    </style>
</head>
<body>
<h2 class="head">Tờ Khai Y Tế</h2>
<h4 class="head">ĐÂY LÀ THÔNG TIN QUAN TRỌNG, THÔNG TIN CỦA QUÍ BÀ CON SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ ĐỀ PHÒNG DỊCH BỆNH TRUYỀN NHIỄM </h4>
<h5 class="head" style="color: red" >Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật và Việt Nam và có thể xử lí hình sự</h5>
<form:form method="" action="">
    <table>
        <tr><form:label path="name">Họ Tên(ghi chữ IN HOA)</form:label></tr>
        <tr><form:input path="name"/></tr>
    </table>
</form:form>
</body>
</html>
