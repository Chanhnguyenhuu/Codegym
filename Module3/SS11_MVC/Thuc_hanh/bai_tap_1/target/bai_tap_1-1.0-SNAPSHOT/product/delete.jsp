<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 06/24/2022
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<h1>Delete Product</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure</h3>
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${product.getName()}"></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><input type="text" name="price" id="price" value="${product.getPrice()}"></td>
            </tr>
            <tr>
                <td>Status: </td>
                <td><input type="text" name="status" id="status" value="${product.getStatus()}"></td>
            </tr>
            <tr>
                <td>Manufacturer: </td>
                <td><input type="text" name="manufacturer" id="manufacturer" value="${product.getManufacturer()}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete Product"></td>
                <td><a href="/product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
