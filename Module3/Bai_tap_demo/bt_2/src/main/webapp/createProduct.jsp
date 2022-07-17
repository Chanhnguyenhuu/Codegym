<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 07/06/2022
  Time: 12:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Product</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
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
            <td>Amount:</td>
            <td><input type="text" name="amount" id="amount"></td>
        </tr>
        <tr>
            <td>Color:</td>
            <td><input type="text" name="color" id="color"></td>
        </tr>
        <tr>
            <td>Describe:</td>
            <td><input type="text" name="describe" id="describe"></td>
        </tr>
        <tr>
            <td>Category:</td>
            <td>
                <select class="form-select" aria-label="Default select example" name="category">
                    <option> Category</option>
                    <c:forEach items="${category}" var="a">
                        <option value="${a.id}">${a.category}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create Product"></td>
        </tr>
    </table>
</form>

<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/popper.js/2.9.3/umd/popper.js"></script>

</body>
</html>
