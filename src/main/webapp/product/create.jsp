
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h3>nhâp id</h3>
<form class="container" action="/products?action=create">
    <div class="mb-3">
        <label for="id" class="form-label">Mã sản phẩm</label>
        <input type="text" class="form-control" id="id" name="id">
    </div>
    <div class="mb-3">
        <label for="name" class="form-label">Tên sản phẩm</label>
        <input type="text" class="form-control" id="name" name="name">
    </div>
    <div class="mb-3">
        <label for="price" class="form-label">Tên sản phẩm</label>
        <input type="text" class="form-control" id="price" name="price">
    </div>
    <div class="mb-3">
        <label for="description" class="form-label">Tên sản phẩm</label>
        <input type="text" class="form-control" id="description" name="description">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<%--<form action="/products?action=create" method="post">--%>
<%--    <input type="text" name="id">--%>
<%--    <h3>nhâp id</h3>--%>
<%--    <input type="text" name="name">--%>
<%--    <h3>nhâp id</h3>--%>
<%--    <input type="text" name="price">--%>
<%--    <h3>nhâp id</h3>--%>
<%--    <input type="text" name="description">--%>
<%--    <button type="submit">Add</button>--%>
<%--</form>--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
