<%--
  Created by IntelliJ IDEA.
  User: wyz
  Date: 2018/8/3
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="/static/css/bootstrap.min.css" rel="stylesheet" />
<link href="/static/css/bootstrap-select.min.css" rel="stylesheet" />

<script src="/static/js/jquery-3.3.1.min.js"></script>
<script src="/static/js/bootstrap-select.min.js"></script>
<script src="/static/js/defaults-zh_CN.min.js"></script>
<script src="/static/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>jsp     ok</h1>
    <h2>${username},${password}</h2>
    <div>
        <select class="selectpicker" multiple>
            <option value="1">广东省</option>
            <option value="2">广西省</option>
            <option value="3">福建省</option>
            <option value="4">湖南省</option>
            <option value="5">山东省</option>
        </select>
    </div>
</body>
</html>
