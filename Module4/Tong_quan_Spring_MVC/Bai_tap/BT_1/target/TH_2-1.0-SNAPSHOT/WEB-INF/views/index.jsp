<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Convert</title>
</head>
<body>
<h1>Convert Money</h1>
<form action="/convert" method="post" autofocus>
    <input name="value">
    <button type="submit">Change</button>
    <p>Result: ${result}</p>
</form>
</body>
</html>