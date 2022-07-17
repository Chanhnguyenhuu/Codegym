<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 06/27/2022
  Time: 02:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<form method="post">
    <p>
        <a href="/product">Back to product list</a>
    </p>
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><input type="text" name="price" id="price"></td>
        </tr>
        <tr>
            <td>Color:</td>
            <td><input type="text" name="color" id="color"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create Product"></td>
        </tr>
    </table>
</form>
</body>
</html>
