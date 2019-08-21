<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Here</title>
</head>
<body>

	<form name="myForm" action="submit-person">
		<p>Name: <input type="text" size="65" name="name"></p><br>
		<p>Email: <input type="text" size="65" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"></p> <br>
		<p>Phone Number: <input type="text" size="65" name="phoneNum"></p> <br> 
		<p>Password: <input type="password" size="65" name="password"></p><br>
		<input type="submit" value="Register" name="Submit">

</body>
</html>