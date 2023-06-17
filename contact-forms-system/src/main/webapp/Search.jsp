<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div class="container-fluid">
    		<span class="navbar-brand mb-0 h1" style="color: white;">X-workz</span>
    		
    		<a href="Contact.jsp" style="color: lime;">Home</a>
  		</div>
 
  		<div>
  			<a href="ImageDisplay.jsp" style="color: lime;">View Image</a>
  		</div>
	</nav>
	
	<h1>Search Page</h1>
	
	<form action="search" method="get">
		Person Name <input type="text" name="personName">
		<input type="submit" value="Search" class="btn-success">
	</form>


<table class="table">
	
		<tr>
			<th>Person Name</th>
			<th>Mobile No</th>
			<th>Email</th>
			<th>Comment</th>
			<th>File</th>
		</tr>
	
	
	<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.personName}</td>
			<td>${dto.mobileNo}</td>
			<td>${dto.email}</td>
			<td>${dto.comments}</td>
			<td>${dto.fileName}</td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>