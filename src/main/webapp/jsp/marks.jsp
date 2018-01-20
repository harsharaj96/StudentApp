<%@ page import="com.ooad.web.Model.Student" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 20-01-2018
  Time: 05:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Marks</title>
    <%--Boot Strap --%>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

<%
    final Student student = (Student) request.getAttribute("student");
%>

    <h1> Student Report </h1>
    <div class="row">
        <div class="col-md-2">
            <p class="h4">Id</p>
            <p id="studentId"><%= student.getId()%> </p>
        </div>
    </div>
    <div class="row">
        <div class="col-md-2">
            <p class="h4">Name</p>
            <p id="studentName"><%= student.getName()%></p>
        </div>
    </div>
    <div class="row">
        <div class="col-md-2">
            <p class="h4">Marks</p>
            <p id="studentMarks"><%= student.getMarks()%></p>
        </div>
    </div>
    <div class="row">
        <div class="col-md-2">
            <img src="<%= student.getImageUrl()%>" alt="studentImage">
        </div>
    </div>

    <div class="row">
        <button class="btn" type="button" id = "home">Home</button>
    </div>






    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
