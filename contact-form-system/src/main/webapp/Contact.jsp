<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<style>
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

<script>
	function validName() {
		var userName = document.getElementById('nameId');
		var userValue = userName.value;
		console.log(userName);
		
		console.log(userValue);
		if(userValue != null && userValue != " " && userValue.length > 3 && userValue.length < 30){
			document.getElementById('nameError').innerHTML = ' ';
		}
		else{
			document.getElementById('nameError').innerHTML = 'user name must be greater than 3 and less than 30';
		}
	}
	
	function validMobileNo() {
		var userMobileNo = document.getElementById('mobile');
		var userValue = userMobileNo.value;
		console.log(userValue);
		
		if(userValue ==10){
			document.getElementById('mobileError').innerHTML = ' ';
		}
		else{
			document.getElementById('mobileError').innerHTML = 'Mobile No should be 10 digits';
		}
	}
	
	function validComment() {
		var userComment = document.getElementById('comment');
		var userValue = userComment.value;
		
		console.log(userValue);
		if(userValue != null && userValue != " " && userValue.length > 3 && userValue.length < 30){
			document.getElementById('commentError').innerHTML = ' ';
		}
		else{
			document.getElementById('commentError').innerHTML = 'comment should be greater than 2 and less than 200';
		}
	}
	
	function validEmail() {
		var userEmail = document.getElementById('email');
		var userValue = userEmail.value;
		
		console.log(userValue);
		if(userValue != null && userValue != " "){
			document.getElementById('emailError').innerHTML = ' ';
		}
		else{
			document.getElementById('emailError').innerHTML = 'email should be not empty';
		}
	}
</script>
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

	<h1 align="center">Contact Form</h1>
	
	<c:forEach items="${errors}" var="error">
		<span style="color: red;">${error.defaultMessage}</span></br>
	</c:forEach>  
	
	<span style="color: green;">${successMsg}</span>
	
	<form action="save" method="post" enctype="multipart/form-data">
	
<div class="form-group">
	Person Name <input type="text" name="personName" class="form-control" onclick="validName()" id="nameId" value="${dto.personName}">
	<span id="nameError" style="color: red;"></span>
</div>
<div class="form-group">
	Mobile Number <input type="text" name="mobileNo" class="form-control" onclick="validMobileNo()" id="mobile" value="${dto.mobileNo}">
	<span id="mobileError" style="color: red;"></span>
</div>		
<div class="form-group">
	Email <input type="text" name="email" class="form-control" onclick="validEmail()" id="email" value="${dto.email}">
	<span id="emailError" style="color: red;"></span>
</div>	
<div class="form-group">
	Comments <textarea rows="3" cols="30" name="comments" class="form-control" onclick="validComment()" id="comment" value="${dto.comments}"></textarea>
	<span id="commentError" style="color: red;"></span>
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