<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 06/15/2022
  Time: 08:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>

    <table>
        <tr>
            <th>Tên</th>
            <th>Ngày Sinh</th>
            <th>Địa Chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td>${customer.name}</td>
                <td>${customer.ngaySinh}</td>
                <td>${customer.diaChi}</td>
                <td>${customer.img}</td>
            </tr>
        </c:forEach>

    </table>


</body>
</html>
