<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	height: 9%;
	
	background-color: navy;
	color: white;
	text-align: center;
}
.park{
	margin: 10px;
}
</style>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div>
  			<img height="80px" 
  				src="https://media.istockphoto.com/id/1342748790/vector/car-parking-icon-parking-space-parking-lot-car-park.jpg?s=612x612&w=0&k=20&c=hNw7RyLko256Z_yvk1IeRnxttUsgtECmCK5zIQvOlQg=">
  			<a href="Home.jsp"><button type="button" class="btn btn-light">Home</button></a>
  		</div>
	</nav>
	
	<div class="park">
		<a href="Userinfo.jsp"><button type="button" class="btn btn-dark">SinghUp</button></a>
		<a href="Usersingin.jsp"><button type="button" class="btn btn-dark">SinghIn</button></a>
	</div>
	
<footer>
	<div class="foot">
		<small>@ 2023 Copyright &copy; xworkz.com</small>
		
	</div>
</footer>

</body>
</html>