<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Image</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style type="text/css">
	div {
		margin-top: 20px;
	}
</style>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color:navy;">
  		<div class="container-fluid">
    		<img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fkinsta.com%2Fblog%2Fwordpress-contact-form-plugins%2F&psig=AOvVaw20TfMStzRgpq3vlWDBCPEd&ust=1686841461588000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOCc-6aEw_8CFQAAAAAdAAAAABAE" height="60px">
  		</div>
  		<div><a href="list" style="color: lime;">List All</a></div>
  		<div><a href="Display.jsp" style="color: lime;">Display Page</a></div>
	</nav>
	
<div>
	<form action="fileDownload" method="get">
		File Name <input type="text" name="fileName">
		Content Type <input type="text" name="contentType">
		<input type="submit" value="Download">
	</form>

</body>
</html>