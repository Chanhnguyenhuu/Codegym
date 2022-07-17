<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 06/27/2022
  Time: 06:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
          crossorigin="anonymous">
</head>
<body>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">

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
            <td scope="row">${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.color}</td>
        </tr>
        </tbody>
    </table>

    <tr>
        <td></td>
        <td><input type="submit" value="Delete Product"></td>
    </tr>

</form>
</body>
</html>


