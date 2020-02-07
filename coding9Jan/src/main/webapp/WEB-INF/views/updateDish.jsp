<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/jss/app.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="form">
		<form action="updateDish" method="post" onsubmit="return validate()">
			Dish:<select name="dishId"><option> Select</option>
			<c:forEach items="${dishes }" var="d">
					<option value="${d.dishId }">${d.dishName} ${d.dishRating}</option>
				</c:forEach>
			</select> <br></br>
			Dish Rating:<input type="text" id="dishRating" required="required" name="dishRating" placeholder="enter dish rating"></input>
			<br></br>
			
			Dish Price:<input type="text" id="dishPrice" required="required" name="dishPrice" placeholder="enter dish price"></input>
			<br></br>
			<button type="submit">SUBMIT</button>
			
			<a href="/"><button type="button" id="home">HOME</button></a>


		</form>
	</div>

</body>
</html>