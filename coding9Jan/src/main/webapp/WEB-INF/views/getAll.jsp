<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Internal info</title>
<meta charset="ISO-8859-1">
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<body>
	<form action="getAll">
		<table border="1">
			<tr>
				<th>Hotels</th>
				<th>Hotel Average Rating</th>
				
			</tr>
			<c:forEach items="${hotel}" var="h">
				<tr>
					<td id="${h.hotelName }">${h.hotelName }</td>
					<td id="${h.averargeHotelRating }">${h.averargeHotelRating}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>
