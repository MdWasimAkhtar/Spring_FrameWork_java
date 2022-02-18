<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
	
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Home Page</title>
</head>
<body>
	<div class="container">
	   
	   <h3 class="text-center"> ${title}</h3>
	   <p class=""> ${desc}</p>
	
		<form action="studentDet" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">Student USN </label> 
				<input
					type="text"
					 class="form-control"
					  id="exampleInputEmail1"
					aria-describedby="emailHelp" 
					placeholder="Enter Your Student Id "
					name="sid"> 
					<small
					id="emailHelp" class="form-text text-muted">
					Enter Your Student Id </small>
			</div>
			
			<div class="form-group">
				<label for="exampleInputEmail1">Student Name </label> 
				<input
					type="text"
					 class="form-control"
					  id="exampleInputEmail1"
					aria-describedby="emailHelp" 
					placeholder="Enter Your Student name "
					name="sname"> 
					<small
					id="emailHelp" class="form-text text-muted">
					Enter Your Name </small>
			</div>
			
			<div class="form-group">
			  <label for=""> Semester </label>
			  <input type="text" 
			         class="form-control"
			         id=""
			         name="sem"> 
			</div>
			
			<div>
			   <button type="submit" class="btn btn-succes">submit</button>
			</div>
		</form>
	</div>





	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>