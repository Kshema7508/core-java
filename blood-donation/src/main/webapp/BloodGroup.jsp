<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<style type="text/css">
.container{
	width: auto;
	position: absolute;
	top: 60%;
	left: 50%;
	transform: translate(-50%,-50%) 
}
body {
	background-color: gray;
}
h1 {
	margin-top: 20px;
	font-style: oblique;
}
</style>
</head>
<body>

	<nav class="navbar navbar-dark bg-dark">
  		<div class="container-fluid">
    		<span class="navbar-brand mb-0 h1">X-workz</span>
  		</div>
  		
  		<div><a href="ImageDisplay.jsp">View Image</a></div>
  		<div><a href="list">List All</a></div>
	</nav>
	
<div class="container">
<div class="card card-body" style="width: 35rem;">

	<h1 align="center">Blood Donation Form</h1>
	
	<c:forEach items="${errors}" var="error">
		<span style="color: red;">${error.defaultMessage}</span></br>
	</c:forEach>  
	
	<span style="color: green;">${successMsg}</span>
	
	<form action="donate" method="post" enctype="multipart/form-data">
	
<div class="form-group">
	Person Name <input type="text" name="personName" class="form-control" value="${dto.personName}">
</div>
<div class="form-group">
	Group <select name="group" class="form-control">
			<option>---Select---</option>
			<option>A+</option>
			<option>B+</option>
			<option>AB+</option>
			<option>O+</option>
			<option>A-</option>
			<option>B-</option>
			<option>O-</option>
		</select>
</div>		
<div class="form-group">
	Age <input type="number" name="age" class="form-control" value="${dto.age}">
</div>	
<div class="form-group">
	Address <textarea rows="3" cols="30" name="address" class="form-control" value="${dto.address}"></textarea>
</div>	
<div class="form-group">
	Weight <input type="text" name="weight" class="form-control" value="${dto.weight}">
</div>
<div class="form-group">
	Select File <input type="file" name="file" class="form-control">
</div>

<input type="submit" value="Save">
</form>
</div>
</div>
</body>
</html>