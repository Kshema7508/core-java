<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<style type="text/css">
table{
background-color: silver;
text-align: center;
}

body{
background-color: olive;
}
</style>

</head>
<body>

<div align="center">
<h1>Welcome to our application</h1> 



	<form action="searchByCompanyName" method="get">
		<input type="text" name="companyName" placeholder="Enter the Company Name">
		<button>Search</button>
	</form>
	<table border="4">
	<thead>
		<tr>
			
			<th>Sl.No</th>
			<th>Company Name</th>
			<th>Model Number</th>
			<th>Color</th>
			<th>Processor</th>
			<th>Ram</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
	
<ref:forEach items="${laptops}" var="laptop">
<tr>
	<td>${laptop.getId()}</td>
	<td>${laptop.getCompanyName()}</td>
	<td>${laptop.getModelNo()}</td>
	<td>${laptop.getColor()}</td>
	<td>${laptop.getProcessor()}</td>
	<td>${laptop.getRam()}</td>
	<td><a href="update/${laptop.getId()}" class="btn btn-success">Update</a>
	&nbsp
	<a href="delete/${laptop.getId()}" class="btn btn-primary">Delete</a></td>
</tr>
</ref:forEach>
</tbody>
</table>
</div>

</body>
</html>