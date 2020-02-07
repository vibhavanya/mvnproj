<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="form">
		<form action="assignHotels" method="post" onsubmit="return validate()">
			Hotels:<select name="hotelId"><option>Select</option>
				<c:forEach items="${hotels }" var="h">
					<option value="${h.hotelId }">${h.hotelName}</option>
				</c:forEach>
			</select> <br></br> 
			Dishes:<select name="dishId"><option> Select</option>
			<c:forEach items="${dishes }" var="d">
					<option value="${d.dishId }">${d.dishName}</option>
				</c:forEach>
			</select> <br></br>
			<button type="submit">ASSIGN</button>
			<br></br> <a href="/"><button type="button" id="home">HOME</button></a>
		</form>
	</div>
</body>
</html>