<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
     <link rel="stylesheet" href="/HRManagement/resources/css/common.css" >
    <script src="https://unpkg.com/ionicons@5.4.0/dist/ionicons.js"></script>
    <title>Edit Employee</title>

    <style>
        .form {
            height: 200px;
            position: relative;
            width: 50%;
            margin-bottom: 4%;
        }

        .center {

            margin-top: 2%;
            margin-left: 20%;
            margin-bottom: 6%;
        }

        .panel {
            
            margin-top: 0% !important;
        }
        .panel-body{
            margin-bottom: 2%;
        }
    </style>


</head>

<body>
    <div class="header">
        <p><b>Employee Management App</b></p>
    </div>
     <% String name = (String) session.getAttribute("userName");
    	name = name.substring(0, name.indexOf("@"));
    	String empCode = (String) request.getAttribute("empCode");
    %>
    <div class="userName">
        <b>Welcome <%=name%></b>

        <a href="/HRManagement/logout">
            <ion-icon name="close-circle-outline"></ion-icon>
        </a>

    </div>
	<span id="error" class="error-msg" style="color: red;display: flex;justify-content: center;"></span>
    <div class="container">
        <div class="panel panel-primary">
            <div class="panel-body">
                <h3 class="text-on-pannel text-primary"><strong class="text-uppercase"> Edit Employee Details</strong>
                </h3>

                <div class="form center">
                    <form class="form-horizontal" action="editEmployeeDetails" method="post" name="empDetailsForm" id="empDetailsForm" onsubmit="return validateFrom()">
                        <div class="form-group">
                            <label class="control-label col-sm-4" for="emp-code" >Employee code:</label>
                            <div class="col-sm-3">
                                <input type="number" class="form-control" id="emp-code" name="empCode" value = <%=empCode %> readonly>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" for="emp-name">Employee Name:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="emp-name" name="empName" maxlenght = "100" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" for="emp-loc">Location:</label>
                            <div class="col-sm-8">
                                <textarea id="emp-loc" class="form-control" name="empLocation" rows="2" cols="45" maxlength="500" required></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" for="emp-email">Email:</label>
                            <div class="col-sm-8">
                                <input type="email" class="form-control" id="emp-email" name="empEmail" maxlenght = "100" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" for="emp-dob">Date of Birth:</label>
                            <div class="col-sm-8">
                                <input type="date" class="form-control" id="emp-dob" name="empDOB">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-offset-2 col-md-2">
                                <button type="submit" class="btn btn-secondary">Save</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" onclick="window.location.href='/employeeManagement/home' " class="btn btn-secondary">Cancel</button>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>


    <div id="footer">
        <p><b>Copyright 2020-2021 by Fresher Training</b></p>
    </div>




    <!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8"
        crossorigin="anonymous"></script>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-lpyLfhYuitXl2zRZ5Bn2fqnhNAKOAaM/0Kr9laMspuaMiZfGmfwRNFh8HlMy49eQ"
        crossorigin="anonymous"></script> -->
        
    <script src="/HRManagement/resources/js/validation.js"></script>
	 <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

</body>

</html>