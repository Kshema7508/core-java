<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style type="text/css">
body {
	background-color: silver;
}
</style>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div class="container-fluid">
    		<span class="navbar-brand mb-0 h1" style="color: white;">X-workz</span>
  		</div>
  		
  		<div><a href="ImageDisplay.jsp" style="color: lime;">View Image</a></div>
  		<div><a href="BloodGroup.jsp" style="color: lime;">Home</a></div>
  		<div><a href="list" style="color: lime;">List All</a></div>
	</nav>

<div align="center">
	
	<span style="color: green;">${successMsg}</span>
	
	<h1>Submitted Response</h1>
	
	Person Name : ${dtos.personName} <br>
	Mobile Number : ${dtos.mobileNo} <br>
	Email : ${dtos.email} <br>
	Comment : ${dtos.comments} <br>
</div>
	
</body>
</html>