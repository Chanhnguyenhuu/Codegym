<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Thu Dien Tu</title>
</head>
<body>
<form:form modelAttribute="email" method="post">
    <table class="table">
        <tbody>
        <tr>
            <td>Languages: </td>
            <td>
                <form:select path="language">
                    <form:options items="${languageList}"></form:options>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Page Size: </td>
            <td>Show
                <form:select path="page_size">
                    <form:options items="${pageSizeList}"></form:options>
                </form:select>
                email per page
            </td>
        </tr>
        <tr>
            <td>Spams filter: </td>
            <td>Show
                <form:checkbox path="filter" value="1"></form:checkbox>
                Enable spams filter
            </td>
        </tr>
        <tr>
            <td>Signature: </td>
            <td>
                <form:textarea path="signature"></form:textarea>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button>Update</button>
                <button>Cancel</button>
            </td>
        </tr>
        </tbody>
    </table>
</form:form>
</body>
</html>