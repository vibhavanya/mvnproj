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
		<form action="hello" method="post" onsubmit="return validate()">
			<h1>Welcome To  MVC Coding Challenge</h1>
			<a href="hotel"><button type="button" id="hotel">Add a hotel</button></a>
			<br></br>
			<a href="dish"><button type="button" id="dish">Add a dish </button></a>
			<br></br>
			<a href="assignHotelsToDish"><button type="button" id="assignHotels">Add a dish in the hotel</button></a>
			<br></br>
			<a href="updateDish"><button type="button" id="updateDish">Update dish</button></a>
			<br></br>	
			<a href="deleteDish"><button type="button" id="deleteDish">Delete Dish</button></a>
			<br></br>
			<a href="getAll"><button type="button" id="getAll">Show all details</button></a>
			<br></br>
			
		</form>
	</div>


</body>
</html>