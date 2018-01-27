<%--
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
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>

    <script src="js/bootstrap.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $("#report").hide();
        });
    </script>

    <script type="text/javascript">
        function pageRedirect() {
            window.location.replace("/createstudent");
        }
    </script>

    <script type="text/javascript">
        function pageRedirectBack() {
            window.location.replace("/student");
        }
    </script>


</head>


<body bgcolor="#ffffff" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" link="#3333cc"
      vlink="#3333cc" alink="#3333cc">

<div id="form">
    <br><br>
    <div align="center">
        <font color="#2E2E2E" size="10" face="Arial, Helvetica, sans-serif"><strong>Student Report
            Portal</strong></font><br>
    </div>
    <br><br>
    <div class="row">

        <div class="col-md-2">
            <h4><font size="4.5"><strong>Enter Student Id :</strong></font></h4>
            <br><br>
            <h4><font size="4.5"><strong>Create New Entry :</strong></font></h4>
        </div>

        <div class="col-md-2">

            <input type="number" id="studentId" name="studentId" class="form-control" placeholder="Enter student id">
            <br><br>
            <button class="btn btn-primary" id="create" onclick="pageRedirect()">Create</button>
        </div>

        <div class="col-md-2">
            <button class="btn btn-primary" id="btn" onclick="getStudent()">Submit</button>
        </div>

    </div>
</div>

<script>
    function getStudent() {
        console.log("entered Here");
        var studentId = $("#studentId").val();
        var url1 = "/api/student/" + studentId;
        console.log(url1);
        $.get(url1, function (result) {
            console.log(result);
            $('#stdntId').html(result.id);
            $('#stdntName').html(result.name);
            $('#stdntMarks').html(result.marks);
            img = document.createElement('img');
            src = result.imageUrl;
            img.src = src;
            img.className += " img-thumbnail";
            img.width = 150;
            img.height = 200;
            $("#stdntImg").append(img);
            $("#form").hide();
            $("#report").show();
        });
    }
</script>

<div id="report">
    <br><br>
    <div align="center">
        <font color="#2E2E2E" size="8" face="Arial, Helvetica, sans-serif"><strong>Student Report</strong></font><br>
    </div>
    <br><br>

    <div class="row">
        <div class="col-md-2">
            <h4><font size="4.5"><strong>Student ID : </strong></font></h4>
            <br>
            <h4><font size="4.5"><strong>Name :</strong></font></h4>
            <br>
            <h4><font size="4.5"><strong>Marks :</strong></font></h4>
            <br>
            <h4><font size="4.5"><strong>Image :</strong></font></h4>
            <br><br><br><br><br>

        </div>

        <div class="col-md-2">
            <!-- Extract values -->
            <div id="stdntId" class="col-md-2"></div>
            <br><br><br>
            <div id="stdntName" class="col-md-2"></div>
            <br><br><br>
            <div id="stdntMarks" class="col-md-2"></div>
            <br><br><br>
            <div id="stdntImg">

            </div>
        </div>

    </div>
    <div align="center">
        <button class="btn btn-primary" id="back" onclick="pageRedirectBack()">Back</button>
    </div>
</div>
</body>
</html>
