<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 06/20/2022
  Time: 05:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/product?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Status</td>
        <td>Manufacturer</td>
        <td>Update</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${products}" var="product">
    <tr>
        <td><c:out value="${product.id}"></c:out></td>
        <td><c:out value="${product.name}"></c:out></td>
        <td><c:out value="${product.price}"></c:out></td>
        <td><c:out value="${product.status}"></c:out></td>
        <td><c:out value="${product.manufacturer}"></c:out></td>
        <td><a href="/product?action=update&id=${product.getId()}">update</a></td>
        <td><a href="/product?action=delete&id=${product.getId()}">delete</a></td>
    <tr>
        </c:forEach>
</table>
</body>
</html>
