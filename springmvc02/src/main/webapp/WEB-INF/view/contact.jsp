<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<title>form</title>
</head>
<body>

	<div class="container mt-5">
	  <h3 class="text-center"> Registration Form</h3>
		<form action="formSubmit" method="post">
		
		   		<div class="form-group">
					<label for="exampleInputEmail1">userId </label> 
					<input
						type="text" 
						class="form-control" 
						id="exampleInputEmail1"
						aria-describedby="emailHelp"
						 placeholder="Enter user Id "
						 name="userId">
				 </div>
				
			<div class="form-group">
					<label for="exampleInputEmail1">User Name</label>
					 <input
						type="text"
						 class="form-control" 
						 id="exampleInputEmail1"
						 aria-describedby="emailHelp" 
						 placeholder="Enter your Name "
						 name="userName">
				</div>
				
				<div class="form-group">
					<label for="exampleInputEmail1">email</label> 
					<input
						type="email" 
						class="form-control" 
						id="exampleInputEmail1"
						aria-describedby="emailHelp"
						 placeholder="Enter email"
						 name="userEmail">
						 <small
						id="emailHelp" class="form-text text-muted">We'll never
						share your email with anyone else.</small>
				</div>
				
				<div class="form-group">
					<label for="exampleInputEmail1">password</label>
					 <input
						type="password" 
						class="form-control"
						 id="exampleInputEmail1"
						aria-describedby="emailHelp" 
						placeholder="Enter your password "
						name="userPasswd"> 
				</div>
				<div class="container text-center">
				   <button type="submit" class="btn btn-success">Sign up</button>
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