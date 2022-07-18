<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Translate</h1>
<form action="/translate" method="post">
    <input name="word">
    <button type="submit">Translate</button>
    <p>${result}</p>
</form>
</body>
</html>