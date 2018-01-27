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
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <script type="text/javascript">
        function pageRedirectBack() {
            window.location.replace("/student");
        }
    </script>

</head>


<body>
<form action="/createstudent" method="post" enctype="multipart/form-data">
    <br><br>
    <div align="center">
        <font color="#2E2E2E" size="8" face="Arial, Helvetica, sans-serif"><strong>Enter details</strong></font><br>
    </div>
    <br><br>
    <div class="row">
        <div class="col-md-2">

            <h4><font size="4.5"><strong>Name :</strong></font></h4>
            <br>
            <h4><font size="4.5"><strong>Marks :</strong></font></h4>
            <br>
            <h4><font size="4.5"><strong>Image :</strong></font></h4>
            <br>

        </div>

        <div class="col-md-2">
            <br>
            <input type="text" name="inputName" placeholder="StudentName">
            <br><br>
            <input type="number" name="inputMarks" placeholder="StudentMarks">
            <br><br>
            <input type="file" name="image" placeholder="studentImage">
            <br>
        </div>

    </div>
    <input type="submit" value="Submit" class="btn btn-primary">
</form>
<button class="btn btn-primary" id="back" onclick="pageRedirectBack()">Back</button>

</body>
</html>
