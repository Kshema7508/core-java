<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
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
h3 {
	margin-top: 10px;
	font-style: oblique;
}
.views{
	margin: 50px;
	margin-top: 0px;
}
</style>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div>
  			<img height="80px" 
  				src="https://media.istockphoto.com/id/1342748790/vector/car-parking-icon-parking-space-parking-lot-car-park.jpg?s=612x612&w=0&k=20&c=hNw7RyLko256Z_yvk1IeRnxttUsgtECmCK5zIQvOlQg=">
  			<a href="ParkingInfo.jsp"><button type="button" class="btn btn-light">Home</button></a>
  		</div>
  		<div class="nav navbar-nav navbar-right">
  			<a href="Singhin.jsp"><button type="button" class="btn btn-light">LogOut</button></a>
  			<p class="navbar-text" style="color: white; font-size: 20px; font-family:serif;">${dto.adminName}</p>
  		</div>
	</nav>
	
		<h3 align="center">Search Location</h3>
		
<div class="views">
	<form action="search" method="get">
		<div class="form-group">
			Location: <select name="location" class="form-control">
				<option>---Select---</option>
				<option>Rajajinagar</option>
				<option>Vijaynagar</option>
				<option>Jayanagar</option>
				<option>JP Nagar</option>
				<option>Vidhyanagar</option>
			</select>
		</div>
		<input type="submit" value="Search" class="btn-success">
	</form>
	

<table class="table table-border">
	
		<tr>
			<th>Location</th>
			<th>Vehicle Type</th>
			<th>Vehicle Classification</th>
			<th>Terms</th>
			<th>Price</th>
			<th>Discount</th>
		</tr>
	
	
	<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.location}</td>
			<td>${dto.vehicleType}</td>
			<td>${dto.vehicleClassfi}</td>
			<td>${dto.terms}</td>
			<td>${dto.price}</td>
			<td>${dto.discount}</td>
		</tr>
	</c:forEach>
</table>		
</div>
	<footer>
		<div class="foot">
			<small>@ 2023 Copyright &copy; xworkz.com</small>
			<p>last_login_time: ${dto.loginTime}</p>
		</div>
	</footer>
	

</body>
</html>