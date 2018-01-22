<%--
  ~ Created by Sandeep Tadepalli on 21/01/18 14:37
  ~ Copyright (c) 2018. All rights reserved.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: sandeep
  Date: 21/1/18
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CreateStudent</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<form action="createstudent" method="post">
    <input type="text" name="inputName" placeholder="StudentName">
    <input type="number" name="inputMarks" placeholder="StudentMarks">
    <input type="submit">
</form>
</body>
</html>
