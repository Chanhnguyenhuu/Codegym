<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 07/11/2022
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find By Id</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
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
        <th>Amount</th>
        <th>Color</th>
        <th>Describe</th>
        <th>Category</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td>${product.amount}</td>
        <td>${product.color}</td>
        <td>${product.describe}</td>
        <td>${product.category.getCategory()}</td>
        <td>
            <button type="button" class="btn btn-primary">
                <a href="/product?action=edit&id=${product.getId()}"
                   style="color: white; text-decoration: none">Edit</a>
            </button>
        </td>
        <td>
            <button type="button" class="btn btn-danger" data-toggle="button" aria-pressed="false"
                    autocomplete="off">
                <%--                    <a style="color: white; text-decoration: none" href="/product?action=delete&id=${product.getId()}">Delete</a>--%>
                <a style="color: white; text-decoration: none"
                   data-bs-toggle="modal" data-bs-target="#modalDelete" onclick="deleteProduct(${product.getId()})">Delete</a>
            </button>
        </td>
    </tr>

    <!-- Modal delete -->
    <div class="modal fade" id="modalDelete" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Xoá</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    Bạn có chắc chắn xoá sản phẩm này không?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Đóng</button>
                    <a href="" id="confirmDelete">
                        <button type="button" class="btn btn-primary">Xác nhận</button>
                    </a>
                </div>
            </div>
        </div>
    </div>


    </tbody>
</table>

<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/popper.js/2.9.3/umd/popper.js"></script>

<script>
    function deleteProduct(id) {
        document.getElementById('confirmDelete').href = '/product?action=delete&id=' + id;
    }
</script>

</body>
</html>
