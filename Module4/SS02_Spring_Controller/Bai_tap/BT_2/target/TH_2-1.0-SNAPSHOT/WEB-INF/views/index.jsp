<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="post">
    <input name="a">
    <input name="b">

    <p>Kết quả: ${result}</p><br>
    <button type="submit" name="calculator" value="+">+</button>
    <button type="submit" name="calculator" value="-">-</button>
    <button type="submit" name="calculator" value="*">*</button>
    <button type="submit" name="calculator" value="/">/</button>
</form>

</body>
</html>