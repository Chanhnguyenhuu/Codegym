<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 06/29/2022
  Time: 06:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Form</title>
</head>
<body>
<form method="post">
    <p>
        <a href="/product">Back to product list</a>
    </p>
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" id="name" value="<c:out value='${product.getName()}'/>"/></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td>
                <input type="text" name="price" id="price" value="<c:out value='${product.getPrice()}'/>"/></td>
        </tr>
        <tr>
            <td>Color:</td>
            <td><input type="text" name="color" id="color" value="<c:out value='${product.getColor()}'/>"/></td>
        </tr>
        <tr>
            <td>Category:</td>
            <td><input type="text" name="category" id="category" value="<c:out value='${product.getCategory()}'/>"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update Product"></td>
        </tr>
    </table>
</form>
</body>
</html>
