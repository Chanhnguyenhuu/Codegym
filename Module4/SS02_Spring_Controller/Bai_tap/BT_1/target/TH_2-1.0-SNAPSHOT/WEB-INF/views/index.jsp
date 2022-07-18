<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Choice</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="Lettuce" id="lettuce" name="condiment">
        <label class="form-check-label" for="lettuce">
            Lettuce
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="Tomato" id="tomato" name="condiment">
        <label class="form-check-label" for="tomato">
            Tomato
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="Mustard" id="mustard" name="condiment">
        <label class="form-check-label" for="mustard">
            Mustard
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="Sprouts" id="sprouts" name="condiment">
        <label class="form-check-label" for="sprouts">
            Sprouts
        </label>
    </div>
    <button type="submit" class="btn btn-primary">Save</button>
</form>
</body>
</html>