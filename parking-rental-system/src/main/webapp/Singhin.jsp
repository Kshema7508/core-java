<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Singh In</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
body{
	background-color: #eee;
}

.foot{
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	
	background-color: navy;
	color: white;
	text-align: center;
}
h1 {
	margin-top: 20px;
	font-style: oblique;
}
.container{
	max-width: 700px;
}
</style>
<script>
	function register() {
		var email=document.getElementById("email") 
		var emailMessage=document.getElementById("emailMessage")
		emailMessage.innerHTML=''
		if(email.value==''){
			emailMessage.innerHTML='Please Enter EmailID'
			emailMessage.style.color='red'
			return
		}
		if(email.value.length < 8){
			var emailMessage=document.getElementById("emailMessage")
			emailMessage.innerHTML='EmailId should be more than 8 characters'
			emailMessage.style.color='red'
		}
		
		var password=document.getElementById("password") 
		var passwordMessage=document.getElementById("passwordMessage")
		passwordMessage.innerHTML=''
		if(password.value==''){
			passwordMessage.innerHTML='Please Enter Password'
			passwordMessage.style.color='red'
			return
		}
	}
</script>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div>
  			<img height="80px" 
  				src="https://media.istockphoto.com/id/1342748790/vector/car-parking-icon-parking-space-parking-lot-car-park.jpg?s=612x612&w=0&k=20&c=hNw7RyLko256Z_yvk1IeRnxttUsgtECmCK5zIQvOlQg=">
  			<a href="Home.jsp"><button type="button" class="btn btn-light">Home</button></a>
  		</div>
	</nav>
	
<h1 align="center">Admin Login</h1>
<div class="container">
<div class="card border-0 shadow">
<div class="card-body">

<h5 style="color: red;">${error}</h5>
<form action="login" method="post">
	<div class="mb-3">
    	<input type="email" name="emailId" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter Email Id">
    	<span id="emailMessage"></span>
	</div>
  	<div class="mb-3">
    	<input type="password" name="password" class="form-control" id="password" placeholder="Enter Password">
    	<span id="passwordMessage"></span>
  	</div>
  	<button type="submit" class="btn btn-primary" onclick="register()">Submit</button>
</form>
</div>
</div>
</div>

<footer>
	<div class="foot">
		<small>@ 2023 Copyright &copy; xworkz.com</small>
		<p>last_login_time: </p>
	</div>
</footer>

</body>
</html>