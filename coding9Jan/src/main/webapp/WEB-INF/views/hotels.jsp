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
		<form action="addHotel" method="post" onsubmit="return validate()">
			Hotel Name:<input type="text" id="hotelName" name="hotelName" placeholder="enter hotel name" required="required"></input>	
			<br></br>
			
			<button type="submit">SUBMIT</button>
			
			<a href="/"><button type="button" id="home">HOME</button></a>


		</form>
	</div>

</body>
</html>