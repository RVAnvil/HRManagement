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
  <link rel="stylesheet" href="/HRManagement/resources/css/login.css" >
  <title>Login</title>
</head>

<body>
    <div class="header">
      <p><b>Employee Management App</b></p>
    </div>

    <div class="container">
      <div class="panel panel-primary">
        <div class="panel-body">
          <h3 class="text-on-pannel text-primary"><strong class="text-uppercase"> Login </strong></h3>
          <form action="process-login" method="post">
            <div class="form-group row pt-3">
              <label for="user-name" class="col-sm-2 col-form-label pt-3" style="margin-left: 17%;">UserId</label>
              <div class="col-sm-6">
                <input type="email" class="form-control" id="user-name" placeholder="Email" name="userName" required>
              </div>
            </div>
            <div class="form-group row pt-3">
              <label for="user-pass" class="col-sm-2 col-form-label pt-3" style="margin-left: 17%;">Password</label>
              <div class="col-sm-6">
                <input type="password" class="form-control" id="user-pass" placeholder="Password"  name="password" required>
              </div>
            </div>
            <div class="form-group row">
              <div class="col-sm-10">
                <button type="submit" class="btn btn-primary" style="margin-left: 44%;">Login</button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>

    <div id="footer">
      <p><b>Copyright 2020-2021 by Fresher Training</b></p>
  </div>