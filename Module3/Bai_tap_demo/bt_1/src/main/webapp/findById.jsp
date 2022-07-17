<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 06/29/2022
  Time: 09:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find By Id</title>
</head>
<body>
<p>
    <a href="/product">Back to product list</a>
</p>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Color</th>

    </tr>
    </thead>
    <tbody>

    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td>${product.color}</td>
        <td>${product.category}</td>
        <td><a href="/product?action=edit&id=${product.getId()}">Edit</a></td>
        <td><a href="/product?action=delete&id=${product.getId()}">Delete</a></td>
    </tr>

    </tbody>
</table>
</body>
</html>
