<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to our application</h1> 
<h1>Your Laptop Brand name is ${name}</h1>  <br>
<a href="listofLaptops"> List Of Laptops</a>

<div align="center">
<table border="1" cellpadding="5">
<caption><h2>List of Laptop Details</h2></caption>
<tr>
<th>Company Name</th>
<th>Model Number</th>
<th>Color</th>
<th>Processor</th>
<th>Ram</th>
</tr>

<ref:forEach items="${laptops}" var="laptop">
<tr>
<td>${laptop.getCompanyName()}</td>
<td>${laptop.getModelNo()}</td>
<td>${laptop.getColor()}</td>
<td>${laptop.getProcessor()}</td>
<td>${laptop.getRam()}</td>
</tr>
</ref:forEach>
</table>
</div>
</body>
</html>