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
</style>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div>
  			<img height="100px" 
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
    	<label for="exampleInputEmail1" class="form-label">Email Id</label>
    	<input type="email" name="emailId" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
	</div>
  	<div class="mb-3">
    	<label for="exampleInputPassword1" class="form-label">Password</label>
    	<input type="password" name="password" class="form-control" id="exampleInputPassword1">
  	</div>
  	<button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
</div>

<footer>
	<div class="foot">
		<small>@ 2023 Copyright &copy; xworkz.com</small>
	</div>
</footer>

</body>
</html>