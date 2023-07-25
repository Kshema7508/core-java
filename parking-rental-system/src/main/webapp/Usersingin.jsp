<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserSingin</title>
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
	height: 9%;
	
	background-color: navy;
	color: white;
	text-align: center;
}
.container{
	max-width: 500px;
	margin: auto; 
	top: 0;
}
h3 {
	font-style: oblique;
}
</style>
</head>

<script>
    var mins=5;
    var secs=mins*60;
    function countdown() {
        setTimeout('Decrement()',60);
    }
    function Decrement() {
        if(document.getElementById) {
            minutes=document.getElementById("minutes");
            seconds=document.getElementById("seconds");
            if(seconds<59) {
                seconds.value=secs;
            }
            else {
                minutes.value=getminutes();
                seconds.value=getseconds();
            }
            if(mins<1) {
                minutes.style.color="red";
                seconds.style.color="red";
            }
            if(mins<0) {
                alert('time up');
                minutes.value=0;
                seconds.value=0;
            }
            else {
                secs--;
                setTimeout('Decrement()',1000);
            }
        }
    }
 
    function getminutes() {
        mins=Math.floor(secs/60);
        return mins;
    }
 
    function getseconds() {
        return secs-Math.round(mins*60);
    }
    
 	function passwordValidation(){
    	
    	var password = document.getElementById("password");
    	var passwordValue = password.value;
    	var passwordSpan = document.getElementById("passwords");
    	if(passwordValue != null && passwordValue != "" && passwordValue.length == 6 ){
    		passwordSpan.innerHTML = "";		
    	}else {
    		
    		passwordSpan.innerHTML = "please enter the valid password";
    		
    	}
    	
    }
</script>

<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div>
  			<img height="80px" 
  				src="https://media.istockphoto.com/id/1342748790/vector/car-parking-icon-parking-space-parking-lot-car-park.jpg?s=612x612&w=0&k=20&c=hNw7RyLko256Z_yvk1IeRnxttUsgtECmCK5zIQvOlQg=">
  			<a href="Home.jsp"><button type="button" class="btn btn-light">Home</button></a>
  		</div>
	</nav>
	
	<h3 align="center">User SingIn</h3>
	
<div class="container">
<div class="card border-0 shadow">
<div class="card-body">
		
		<span style="color: green;">${successMsg}</span>
		<span style="color : red; ">${emailError}</span>
		
		<span style="color : red; ">${generateotperror}</span>
		
		
		<form action="sendotp" method="post">
			
			<div class="mb-3">
			
    			<input type="email" name="email" class="form-control" value="${emailId}"  placeholder="Enter Email Id">
    			<input type="submit" name="generateOtp" value="generateOtp" onclick="countdown();" >
    		
    		</div>
    		
    		<div class="mb-3">
    			
    			<input type="text" name="oneTimePassword" class="form-control" placeholder="Enter your otp" id="password" >
    			<input type="submit" name="login" value="Login" onclick="passwordValidation()">
    			<span style="color: red;">${error}</span>
    		</div>
 
    		 
    	<div id="some_div"></div>
    		<div style="display: flex; width:80%;
                		justify-content:center; padding-top: 0%;">
        		Time Left ::
    	</div>
    	<div style="display: flex; width:80%;
                		justify-content:center; padding-top: 0%;">
        	<input id="minutes" type="text" style="width: 8%; border: none; font-size: 16px;
                      font-weight: bold; color: black;">
        	<font size="5">
            	:
       	 	</font>
        	<input id="seconds" type="text" style="width: 8%; border: none; font-size: 16px;
                      font-weight: bold; color: black;">
    	</div>
    		
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