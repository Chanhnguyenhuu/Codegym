<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 06/27/2022
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
          crossorigin="anonymous">

</head>
<body>
<p>
    <a href="/product?action=create">Create new product</a><br>
<form action="/product">
    <p>
        <input type="hidden" name="action" value="findById">
        <input type="text" name="findId" id="findId">
        <button type="submit">Search</button>
    </p>
</form>
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
    <c:forEach items="${product}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.color}</td>
            <td><a href="/product?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a href="/product?action=delete&id=${product.getId()}">Delete</a></td>
            <td>
                <button type="button" class="btn btn-danger">Delete</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script type="text/javascript" src="webjars/jquery/3.6.0/dist/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/popper.js/2.9.3/umd/popper.js"></script>
</body>
</html>
