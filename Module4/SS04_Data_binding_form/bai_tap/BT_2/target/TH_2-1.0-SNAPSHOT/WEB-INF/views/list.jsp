<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 07/25/2022
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Song List</title>
</head>
<body>

<form action="/upload">
    <button type="submit">Create</button>
</form>
<c:if test="${ not empty message}">
    <h2 style="color: green" >${message}</h2>
</c:if>

<table border="1">
    <form:form modelAttribute="songList">
        <tr>
            <td>Name</td>
            <td>Creator</td>
            <td>Category</td>
            <td>Link</td>
        </tr>
        <c:forEach items="${songList}" var="a">
            <tr>
                <td>${a.name}</td>
                <td>${a.creator}</td>
                <td>${a.category}</td>
                <td>${a.link}</td>
            </tr>
        </c:forEach>
    </form:form>
</table>

</body>
</html>
