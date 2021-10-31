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

	<%@include file = "components/header.jsp" %>

	<section class="content">
		
		<div class="profile-content row">

			<div class="profile-con col-8">

				<div class="profile-head row">
					<i class="fas fa-user-circle profile-img"></i>
					<p class="profile-name">
						<s:property value="myProfile.fname" /> <s:property value="myProfile.lname" />
					</p>
					<div class="profile-btn-gp">
						<button class="profile-btn-1 text-center">Upload CV</button>
					</div>
				</div>

				<div class="profile-info-con">
					<form action ="editProcess">
						<div class="profile-info row">
							<p class=" profile-label col-3">Name:</p>
							<p class=" profile-text col-9">
								<input type="text" class="" style="width: 12rem;" name="user.fname" value="<s:property value="myProfile.fname" />">
								<input type="text" class="" style="width: 12rem; margin-left: 1rem" name="user.lname" value="<s:property value="myProfile.lname" />">
							</p>
						</div>

						<div class="profile-info row">
							<p class=" profile-label col-3">Position:</p>
							<p class=" profile-text col-9">
								<input type="text" name="user.postion" value="<s:property value="myProfile.postion" />">
							</p>
						</div>

						<div class="profile-info row">
							<p class=" profile-label col-3">Location:</p>
							<p class=" profile-text col-9">
								<input type="text" name="user.location" value="<s:property value="myProfile.location" />">
							</p>
						</div>

						<div class="profile-info row">
							<p class=" profile-label col-3">Age:</p>
							<p class=" profile-text col-9">
								<input type="text" name="user.age" value="<s:property value="myProfile.age" />">
							</p>
						</div>

						<div class="profile-info row">
							<p class=" profile-label col-3">Email:</p>
							<p class=" profile-text col-9">
								<input type="text" name="user.email" value="<s:property value="myProfile.email" />">
							</p>
						</div>

						<div class="profile-info row">
							<p class=" profile-label col-3">Contact No:</p>
							<p class=" profile-text col-9">
								<input type="text" name="user.phno" value="<s:property value="myProfile.phno" />">
							</p>
						</div>

						<div class="profile-info row">
							<p class=" profile-label col-3">Description</p>
							<p class=" profile-text col-9">
								<textarea name="user.description" placeholder=""><s:property value="myProfile.description" /></textarea>
							</p>
						</div>
						<div class="m-error" style="margin:auto;"><p class="text-center">  <s:property value = "message"/> </p></div>
						<button value="my_profile" class="profile-up-btn">Update profile</button>
					</form>
				</div>

			</div>
			<div class="people-con-1 col-4">
				
			</div>
		</div>
	</section>

	<%@include file = "components/footer.jsp" %>
</body>
</html>