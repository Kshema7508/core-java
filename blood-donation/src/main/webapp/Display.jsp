<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Donation Application</title>
<style >

th{
	background-color: silver;
}

td{
	background-color:aqua;
}

</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div class="container-fluid">
    		<img src="https://th.bing.com/th?id=OIP.z6lutkbBZSFIcNU0SziRpgHaIG&w=239&h=261&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2" height="60px">
    		
    		<a href="BloodGroup.jsp" style="color: lime;">Home</a>
  		</div>
  		
  		<div>
  			<a href="ImageDisplay.jsp" style="color: lime;">View Image</a>
  		</div>
	</nav>
	
<div align="center">
	
	<h1>List Of Submitted Response</h1>
	
<table border="1" cellpadding="5">
	
		<tr>
			<th>Person Name</th>
			<th>Blood Group</th>
			<th>Age</th>
			<th>Address</th>
			<th>Weight</th>
			<th>File</th>
		</tr>
	
	
	<c:forEach items="${dtos}" var="dto">
		<tr>
			<td>${dto.personName}</td>
			<td>${dto.group}</td>
			<td>${dto.age}</td>
			<td>${dto.address}</td>
			<td>${dto.weight}</td>
			<td><a target="_blank" href="fileDownload?fileName=${dto.fileName}&contenyType=${dto.contentType}">${dto.fileName}</a></td>
		</tr>
	</c:forEach>
	
</table>
</div>
</body>
</html>