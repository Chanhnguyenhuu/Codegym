<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nitro 5
  Date: 07/18/2022
  Time: 08:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>Condiments</h1>
<c:forEach items="${condiment}" var="a">
    ${a}<br>
</c:forEach>
</body>
</html>
