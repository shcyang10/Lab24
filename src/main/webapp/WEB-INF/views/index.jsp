<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
	Welcome to the Coffee Shop!
	<a href="register">Register</a>

	<h1>Buy these!</h1>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Category</th>
				<th>Description</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="f" items="${items }">
				<tr>
					<td>${f.id }</td>
					<td>${f.name }</td>
					<td>${f.description }</td>
					<td>${f.quantity }</td>
					<td>${f.price }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>