<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<form action="addDish" method="post" onsubmit="return validate()">
			Dish Name:<input type="text" id="dishName" name="dishName" placeholder="enter dish name" required="required"></input>
			
			<br></br>
			Dish Rating:<input type="number" id="dishRating" required="required" name="dishRating" placeholder="enter dish rating" min="1" max="10"></input>
			<br></br>
			
			Dish Price:<input type="number" id="dishPrice" required="required" name="dishPrice" placeholder="enter dish price" min="1" max="100"></input>
			<br></br>
			<button type="submit">SUBMIT</button>
			
			<a href="/"><button type="button" id="home">HOME</button></a>


		</form>
	</div>

</body>
</html>