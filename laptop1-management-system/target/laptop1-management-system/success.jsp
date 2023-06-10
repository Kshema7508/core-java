<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Laptop Application</title>
<style >

th{
	background-color: yellow;
}

td{
	background-color:aqua;
}

</style>
</head>
<body bgcolor="lightgreen">
<h1>Welcome to our application</h1> 
<h1>Your Laptop Brand name is ${name}</h1>  <br>
<a href="listofLaptops"> List Of Laptops</a>

<div align="center">

	<form action="searchByCompanyName" method="get">
		<input type="text" name="companyName" placeholder="Enter the Company Name">
		<button>Search</button>
	</form>

	<table border="1" cellpadding="5">
		<caption><h2>List of Laptop Details</h2></caption>
		<tr>
			
			<th>Sl.No</th>
			<th>Company Name</th>
			<th>Model Number</th>
			<th>Color</th>
			<th>Processor</th>
			<th>Ram</th>
			<th>Action</th>
		</tr>

	<ref:forEach items="${laptops}" var="laptop">
<tr>
<td>${laptop.getId()}</td>
<td>${laptop.getCompanyName()}</td>
<td>${laptop.getModelNo()}</td>
<td>${laptop.getColor()}</td>
<td>${laptop.getProcessor()}</td>
<td>${laptop.getRam()}</td>
<td><a href="update/${laptop.getId()}">Update</a>
&nbsp
<a href="delete/${laptop.getId()}">Delete</a></td>
</tr>
</ref:forEach>
</table>
</div>
</body>
</html>