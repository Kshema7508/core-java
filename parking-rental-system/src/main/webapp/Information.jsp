<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	
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
<!-- <script>
	function register() {
		var location=document.registeration.location
		var locationMessage=document.getElementById("locationMessage")
		locationMessage.innerHTML=''
		if(location.value=="0"){
			locationMessage.innerHTML='Please select Location'
			locationMessage.style.color='red'
			return
		}

		var vehicleType=document.registeration.vehicleType
		var typeMessage=document.getElementById("typeMessage")
		typeMessage.innerHTML=''
		if(vehicleType.value=="0"){
			typeMessage.innerHTML='Please select Vehicle Type'
				typeMessage.style.color='red'
			return
		}

		var vehicleClassfi=document.registeration.vehicleClassfi
		var classificationMessage=document.getElementById("classificationMessage")
		classificationMessage.innerHTML=''
		if(vehicleClassfi.value=="0"){
			classificationMessage.innerHTML='Please select Vehicle Classification'
				classificationMessage.style.color='red'
			return
		}

		var terms=document.registeration.terms
		var termsMessage=document.getElementById("termsMessage")
		termsMessage.innerHTML=''
		if(terms.value=="0"){
			termsMessage.innerHTML='Please select Terms'
			termsMessage.style.color='red'
			return
		}

		var price = document.getElementById("price");
		var priceMessage =document.getElementById("priceMessage");
		
		priceMessage.innerHTML=''
		if(price.value==''){
			priceMessage.innerHTML = 'Please Enter the Price'
			priceMessage.style.color='red'
				return
		}

		var discount = document.getElementById("discount")
		var discountMessage =document.getElementById("discountMessage")
		
		discountMessage.innerHTML=''
		if(discount.value==''){
			discountMessage.innerHTML = 'Please Enter the Discount'
				discountMessage.style.color='red'
				return
		}	
	}
</script> -->
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
	
	
	<h3 align="center">Parking Information Form</h3>

<section>

<div class="container">
<div class="card border-0 shadow">
<div class="card card-body"> 
	
	
	
	<c:forEach items="${errors}" var="error">
		<span style="color: red;">${error.defaultMessage}</span></br>
	</c:forEach>  
	
	
	<form action="save" method="post" name="registeration">
	
		<div class="form-group">
			Location: <select name="location" class="form-control"  required>
				<option value="">---Select---</option>
				<option>Rajajinagar</option>
				<option>Vijaynagar</option>
				<option>Jayanagar</option>
				<option>JP Nagar</option>
				<option>Vidhyanagar</option>
			</select>
		</div>
		
		<div class="form-group">
			Vehicle Type: <select name="vehicleType" class="form-control" required>
				<option value="">---Select---</option>
				<option>2 Wheeler</option>
				<option>4 Wheeler</option>
				<option>Electric</option>
			</select>
		</div>
		
		<div class="form-group">
			Vehicle Classification: <select name="vehicleClassfi" class="form-control" required>
				<option value="">---Select---</option>
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
			Terms: <select name="terms" class="form-control" required>
				<option value="">---Select---</option>
				<option>1 Day</option>
				<option>7 Days</option>
				<option>15 Days</option>
				<option>30 Days</option>
				<option>56 Days</option>
				<option>90 Days</option>
				<option>250 Days</option>
				<option>365 Days</option>
			</select>
			<span id="termsMessage"></span>
		</div>
		
		<div class="form-group">
			Price: <input type="text" name="price" class="form-control" required>
		</div>
		
		<div class="form-group">
			Discount: <input type="text" name="discount" class="form-control" required>
		</div>
		
		<button type="submit" class="btn btn-primary">Save</button>
		
	</form>
</div>
</div>
</div>	
</section>
	
	<footer>
		<div class="foot">
			<small>@ 2023 Copyright &copy; xworkz.com</small>
			<p>last_login_time: ${dto.loginTime}</p>
		</div>
	</footer>
	
</body>
</html>