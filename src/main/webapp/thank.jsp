<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>AbcJobPortal</title>
	
<!-- CSS -->

	<!-- For Bootstraps -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	<!-- Custom CSS -->
	<link rel="stylesheet" type="text/css" href="./css/style.css">

<!-- Scripts -->

	<!-- For Bootsraps -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>


</head>
<body>

	<header>
		<div>
			<p class="text-center">Welcome to ABC Jobs</p>
		</div>
	</header>

	<section class="content row" style="padding-bottom: 5rem;">

		<div class="register-form col-4">
			<form action="register" method="post">
				<div class="logo-img">
					<img src="./images/Logo.png">
				</div>
				
				<div class="thank-con">
					<div class="form-heading">
						<h1 class="text-center">Registration Successful!</h1>
					</div>
					<div class="thank-content text-center">
						<p>Thank you for your Registration.</p>
					</div>
					
					<div class="fpass">
						<p class="text-center text" style="margin-top: 1rem;" ><a href = "log_in">Go to login</a></p>

					</div>
				</div>
	
			</form>
		</div>

	</section>
	<%@include file = "components/footer.jsp" %>
</body>
</html>