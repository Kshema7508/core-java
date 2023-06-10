<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div class="container-fluid">
    		<img src="https://th.bing.com/th?id=OIP.z6lutkbBZSFIcNU0SziRpgHaIG&w=239&h=261&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2" height="60px">
  		</div>
  		
  		<div><a href="ImageDisplay.jsp" style="color: lime;">View Image</a></div>
  		<div><a href="BloodGroup.jsp" style="color: lime;">Home</a></div>
  		<div><a href="list" style="color: lime;">List All</a></div>
	</nav>

<div align="center">
	
	<span style="color: green;">${successMsg}</span>
	
	<h1>Submitted Response</h1>
	
	Person Name : ${dtos.personName} <br>
	Blood Group : ${dtos.group} <br>
	Age : ${dtos.age} <br>
	Address : ${dtos.address} <br>
	Weight : ${dtos.weight} <br>
</div>
</body>
</html>