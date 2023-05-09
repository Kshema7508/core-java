<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Laptop</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updatelaptop" method="post">
Laptop Id:<input type="text" value="${laptop.getId()}" name="id"> <br>
Company Name:<input type="text" value="${laptop.getCompanyName()}" name="companyName"> <br> 
Model No:<input type="text" value="${laptop.getModelNo()}" name="modelNo"> <br> 
Color:<input type="text" value="${laptop.getColor()}" name="color"> <br>
Processor:<input type="text" value="${laptop.getProcessor()}" name="processor"> <br>
Ram:<input type="text" value="${laptop.getRam()}" name="ram"> <br>
<button type="submit">Update</button>
</form>
</body>
</html>