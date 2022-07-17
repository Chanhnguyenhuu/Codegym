<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 07/10/2022
  Time: 07:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Product</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<form method="post">
    <table class="table">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Amount</th>
            <th>Color</th>
            <th>Describe</th>
            <th>Category</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${product.id}</td>
            <td><input type="text" name="name" id="name" value="<c:out value='${product.name}'/>"/></td>
            <td><input type="text" name="price" id="price" value="<c:out value='${product.price}'/>"/></td>
            <td><input type="text" name="amount" id="amount" value="<c:out value='${product.amount}'/>"/></td>
            <td><input type="text" name="color" id="color" value="<c:out value='${product.color}'/>"/></td>
            <td><input type="text" name="describe" id="describe" value="<c:out value='${product.describe}'/>"/></td>
            <td>
                <select class="form-select" aria-label="Default select example" name="category">
                    <option value="${product.category.getId()}">${product.category.getCategory()}</option>
                    <c:forEach items="${category}" var="a">
                        <option value="${a.id}">${a.category}</option>
                    </c:forEach>
                </select>
            </td>
            <td><input type="submit" value="Update Product"></td>
        </tr>
        </tbody>
    </table>
</form>
<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/popper.js/2.9.3/umd/popper.js"></script>
</body>
</html>
