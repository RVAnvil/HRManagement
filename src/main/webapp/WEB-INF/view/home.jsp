<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>    
<%@page import="java.util.List"%>
<%@page import="com.nagarro.hrManagement.model.EmployeeDetails"%>    
<%@page import ="com.nagarro.hrManagement.util.DateConversion"  %>
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
  <title>Employee Management</title>
</head>

<body>
    <div class="header">
      <p><b>Employee Management App</b></p>
    </div>
    <%-- <%  String name = (String) request.getAttribute("name"); 
    	name = name.substring(0, name.indexOf("@"));
    %> --%>
    <% String name = (String) session.getAttribute("userName");
    name = name.substring(0, name.indexOf("@"));%>
    
    <div class="userName">
        <b>Welcome <%=name%> | </b>
        
        <a href="/HRManagement/logout"><ion-icon name="close-circle-outline"></ion-icon></a>
      
    </div>

    <div class="container">
      <div class="panel panel-primary">
        <div class="panel-body">
          <h3 class="text-on-pannel text-primary"><strong class="text-uppercase"> Employee Listing </strong></h3>
          <div class="btns">
            <button type="button" class="btn btn-secondary" style="margin-right: 2%; margin-bottom: 2%;" onclick="location.href='/HRManagement/upload'" value="Register">Upload Employee Details</button>
            <button type="button" class="btn btn-secondary" style="margin-bottom: 2%;" onclick="location.href='/HRManagement/downloadEmployeeDetails'">Download Employee Details</button>
            
          </div>
        
          <table class="table table-bordered border-dark">
            <thead class="table-secondary border-dark">
              <tr>
                <th scope="col" class="border-dark text-center">Employee Code</th>
                <th scope="col" class="border-dark text-center">Employee Name</th>
                <th scope="col" class="border-dark text-center">Location</th>
                <th scope="col" class="border-dark text-center">Email</th>
                <th scope="col" class="border-dark text-center">Date Of Birth</th>
                <th scope="col" class="border-dark text-center">Action</th>
              </tr>
            </thead>
            <tbody>
            <%
      
            List<EmployeeDetails> employeeList = (List) request.getAttribute("employeeList");
			if (employeeList != null)
				for (EmployeeDetails employee : employeeList) {
            		String date = DateConversion.getConvertedDate(employee.getEmpDOB());
            %>
              <tr>
                <th scope="row" class="border-dark text-center"><%= employee.getEmpCode() %></th>
                <td class="border-dark text-center"><%= employee.getEmpName() %></td>
                <td class="border-dark text-center"><%= employee.getEmpLocation()%></td>
                <td class="border-dark text-center"><%= employee.getEmpEmail() %></td>
                <td class="border-dark text-center"><%= date%></td>
                <td class="border-dark text-center"><a href="/HRManagement/editEmployee/<%= employee.getEmpCode() %>">Edit</a></td>
              </tr>
            <%} %>
            </tbody>
          </table>
        </div>
      </div>
    </div>

    <div id="footer">
      <p><b>Copyright 2020-2021 by Fresher Training</b></p>
  </div>

</body>

</html>