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

	<!-- For Bootstraps -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

	<!-- font awesome -->
	<script src="https://kit.fontawesome.com/b3d00b4272.js" crossorigin="anonymous"></script>
	
	<!-- For validation -->
	<script type="text/javascript" src="validate.js"></script>

</head>
<body>

	<header>
		<nav class="navi-bar">
			<div>
				<div class="navi-logo-con">
					<img src="./images/logo2.png" class="navi-logo-img">
				</div>
				<div class="search-con">
				    <form action="search_result">
				      <input type="text" placeholder="Search.." value = "<s:property value = "keyword"/>" name="keyword">
				      <button><i class="fa fa-search"></i></button>
				    </form>
				</div>
				<div class="navi-con">
					<div class="navi-link">
						<a href="home">
							<i class="fas fa-home navi-icon text-center"></i>
							<p class="navi-text">Home</p>
						</a>
					</div>
					<div class="navi-link">
						<a href="#">
							<i class="fas fa-briefcase navi-icon text-center"></i>
							<p class="navi-text">Jobs</p>
						</a>
					</div>
					<div class="navi-link">
						<a href="#">
							<i class="fas fa-users navi-icon text-center"></i>
							<p class="navi-text">People</p>
						</a>
					</div>
					<div class="navi-link">
						<a href="#">
							<i class="fas fa-comments navi-icon text-center"></i>
							<p class="navi-text">Message</p>
						</a>
					</div>
					<div class="navi-link">
						<a href="#">
							<i class="fas fa-bell navi-icon text-center"></i>
							<p class="navi-text">Notification</p>
						</a>
					</div>
					<div class="navi-link dropdown show">
						<a href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							<i class="fas fa-user-circle navi-icon text-center"></i>
							<p class="navi-text dropdown-toggle">Account</p>
							
							<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
								<s:if test="#session.role == 'user'">
								    <a class="dropdown-item row" style="color: #000080;" href="my_profile">
								    	<i class="fas fa-user-alt"></i> 
								    	&nbsp;My profile
								    </a>
								    <div class="dropdown-divider" style="border-color: grey;"></div>
								</s:if>
							    
							    <a class="dropdown-item row" style="color: #000080;" href="logout">
							    	<i class="fas fa-sign-out-alt"></i>
							    	&nbsp;Log out
							    </a>
							</div>
						</a>
					</div>
				</div>
			</div>
		</nav>
	</header>
	
</body>
</html>