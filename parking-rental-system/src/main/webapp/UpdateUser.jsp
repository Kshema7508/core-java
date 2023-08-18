<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
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
h3 {
	font-style: oblique;
}
.container{
	max-width: 600px;
	margin: auto;
	height:650px;
	top: 0;
	bottom: 0;
	right: 0;
	left: 0;	
	
}
</style>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div>
  			<img height="80px" 
  				src="https://media.istockphoto.com/id/1342748790/vector/car-parking-icon-parking-space-parking-lot-car-park.jpg?s=612x612&w=0&k=20&c=hNw7RyLko256Z_yvk1IeRnxttUsgtECmCK5zIQvOlQg=">
  		</div>
  		<div class="nav navbar-nav navbar-right">
  			<a href="Userlogin.jsp"><button type="button" class="btn btn-light">LogOut</button></a>
  			<p class="navbar-text" style="color: white; font-size: 20px; font-family:serif;">User: ${userDto.userName}</p>
  		</div>
	</nav>
	
	<h3 align="center">User Parking Information Form</h3>
	
<div class="container">
<div class="card border-0 shadow">
<div class="card card-body"> 

	<c:forEach items="${errors}" var="error">
		<span style="color: red;">${error.defaultMessage}</span></br>
	</c:forEach>  
	
	
	<form action="${pageContext.request.contextPath}/updateuserpark" method="post" enctype="multipart/form-data">
	
		<div class="form-group">
			<input type="text" value="${parkingid.getParkingId()}" name="parkingId" readonly="readonly"> 
		</div>
	
		<div class="form-group">
			<select name="location" class="form-control" id="location">
				<option value="">${parkingid.getLocation()}</option>
				<option>Rajajinagar</option>
				<option>Vijaynagar</option>
				<option>Jayanagar</option>
				<option>JP Nagar</option>
				<option>Vidhyanagar</option>
			</select>
		</div>
		
		<div class="form-group">
			<select name="vehicleType" class="form-control" id="vehicleType"  >
				<option value="">${parkingid.getVehicleType()}</option>
				<option>2 Wheeler</option>
				<option>4 Wheeler</option>
				<option>Electric</option>
			</select>
		</div>
		
		<div class="form-group">
			<select name="vehicleClassfi" class="form-control" id="vehicleClassfi" >
				<option value="">${parkingid.getVehicleClassfi()}</option>
				<option>Bike</option>
				<option>Kia</option>
				<option>Bmw</option>
				<option>Nano</option>
				<option>Etica</option>
				<option>Tata Tiago EV</option>
				<option>i20</option>
				<option>Etica</option>
				<option>Swift</option>
				<option>Hyunduai Kona Electric</option>
				<option>Audi</option>
				<option>Skoda</option>
			</select>
		</div>
		
		<div class="form-group">
			<select name="terms" class="form-control" id="terms" onchange="findPrice()" >
				<option value="">${parkingid.getTerms()}</option>
				<option>1 Day</option>
				<option>7 Days</option>
				<option>15 Days</option>
				<option>30 Days</option>
				<option>56 Days</option>
				<option>90 Days</option>
				<option>250 Days</option>
				<option>365 Days</option>
			</select>
		</div>
		
		<div class="form-group">
			Price: <input type="number" name="price"  class="form-control" id="price" value="${parkingid.getPrice()}" readonly="readonly">
		</div>
		
		<div class="form-group">
			Discount: <input type="number" name="discount" class="form-control" id="discount" value="${parkingid.getDiscount()}" readonly="readonly">
		</div>
		
		<div class="form-group">
			Total Amount: <input type="number" name="totalAmount" class="form-control" id="totalAmount" value="${parkingid.getTotalAmount()}" readonly="readonly">
		</div>
		
		<div >
			Upload Vehicle Image <input type="file" name="file" id="fileName" class="form-control" value="<a target="_blank" href="fileDownload?fileName=${parkingid.getFileName()}&contentType=${parkingid.getContentType()}">${parkingid.getFileName()}</a>">
		</div>
		
		<button type="submit" class="btn btn-primary">Save</button>
		
	</form>
</div>
</div>
</div>	
	
	<footer>
		<div class="foot">
			<small>@ 2023 Copyright &copy; xworkz.com</small>
			<p>last_login_time: ${userDto.loginTime}</p>
		</div>
	</footer>
	
</body>
</html>