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

	<!-- For validation -->
	<script type="text/javascript" src="validate.js"></script>
	<script type="text/javascript" src="query.js"></script>

</head>
<body>

	<header>
		<div>
			<p class="text-center">Welcome to ABC Jobs</p>
		</div>
	</header>

	<section class="content row">

		<div class="log-in-form col-4">
			<form id="form" action="changePass" method="post">
				<div class="logo-img">
					<img src="./images/Logo.png">
				</div>

				<div class="form-heading">
					<h1 class="text-center">Change your password</h1>
				</div>

				<div class="form-content col-11">
					
					<div class="row" style="margin-bottom: 1rem;">
						<div class="col-3">
							<p>New password</p>
						</div>
						<div class="col-1">
							<p>:</p>
						</div>
						<div class="col-8">
							<input type="hidden" name = "email" value="<s:property value="email" />">
							<input class="form-control" type="password" id="password" name="password" placeholder="Enter your Password" onblur="return chkblank('password','p-error')">
							<div class="error"><p id="p-error"></p></div>
						</div>
					</div>

					<div class="row">
						<div class="col-3">
							<p>Confirm New Password</p>
						</div>
						<div class="col-1">
							<p>:</p>
						</div>
						<div class="col-8">
							<input class="form-control" type="password" id="cpassword" placeholder="Re-enter your Password" onblur="return chkpw('cpassword','cp-error')">
							<div class="error"><p id="cp-error"></p></div>
						</div>
					</div>

				</div>
				
				<div class="submit-button">
					<button id="submit" value="log_in">Change</button>
				</div>
	
			</form>
		</div>

	</section>

	<%@include file = "components/footer.jsp" %>
</body>
</html>