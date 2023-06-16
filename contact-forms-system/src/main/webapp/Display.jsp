<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
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
    		<span class="navbar-brand mb-0 h1" style="color: white;">X-workz</span>
    		
    		<a href="Contact.jsp" style="color: lime;">Home</a>
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
			<th>Mobile No</th>
			<th>Email</th>
			<th>Comment</th>
			<th>File</th>
		</tr>
	
	
	<c:forEach items="${dtos}" var="dto">
		<tr>
			<td>${dto.personName}</td>
			<td>${dto.mobileNo}</td>
			<td>${dto.email}</td>
			<td>${dto.comments}</td>
			<td><a target="_blank" href="fileDownload?fileName=${dto.fileName}&contenyType=${dto.contentType}">${dto.fileName}</a></td>
		</tr>
	</c:forEach>
	
</table>
</div>

</body>
</html>