<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create new Song</title>
</head>
<body>
<form:form mehtod="post" modelAttribute="song">
    <table class="table">
        <tbody>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"></form:input></td>
        </tr>
        <tr>
            <td>Creator:</td>
            <td><form:input path="creator"></form:input></td>
        </tr>
        <tr>
            <td>Category:</td>
            <td>
                <form:select path="category">
                    <form:options items="${categoryList}"></form:options>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Link:</td>
            <td><form:input path="link"></form:input></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit">Upload</button></td>
        </tr>
        </tbody>
    </table>
</form:form>
</body>
</html>