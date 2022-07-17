<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
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
        <th>Category</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${product}" var="product" varStatus="count">
        <tr>
            <td>${count.index}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.color}</td>
            <td>${product.category}</td>

            <td>
                <button type="button" class="btn btn-primary" data-toggle="button" aria-pressed="false"
                        autocomplete="off">
                    <a style="color: white; text-decoration: none" href="/product?action=edit&id=${product.getId()}">Edit</a>
                </button>
            </td>
            <td>
                <button type="button" class="btn btn-danger" data-toggle="button" aria-pressed="false"
                        autocomplete="off">
                        <%--                    <a style="color: white; text-decoration: none" href="/product?action=delete&id=${product.getId()}">Delete</a>--%>
                    <a style="color: white; text-decoration: none"
                       data-bs-toggle="modal" data-bs-target="#modalDelete" onclick="deleteProduct(${product.id})">Delete</a>
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
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
</table>

<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/popper.js/2.9.3/umd/popper.js"></script>

<script>
    function deleteProduct(id) {
        //console.log(id);
        document.getElementById('confirmDelete').href = '/product?action=delete&id=' + id;
    }
</script>

</body>
</html>
