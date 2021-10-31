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

	<!-- font awesome -->
	<script src="https://kit.fontawesome.com/b3d00b4272.js" crossorigin="anonymous"></script>
	
	<!-- For validation -->
	<script type="text/javascript" src="validate.js"></script>

</head>
<body>

	<%@include file = "components/header.jsp" %>

	<section class="content">
		
		<div class="profile-content row">

			<div class="search-result-con col-9">
				<div class="result-content col-10">
				
				<div class="search-error" style="margin:auto;"><p class="text-center" style = "color: red; font-weight: bold;">  <s:property value = "message"/> </p></div>

				<s:iterator value="list">
					<div class="result-holder">
						<a href="other_profile?id=<s:property value="id" />" class="row">
							<div class="search-img-con col-3">
								<i class="fas fa-user-circle search-img"></i>
							</div>
							<div class="result-info col-7">
								<p class="result-header"><s:property value="fname"/> <s:property value="lname" /></p>
								<div class="result-des">
									<p><s:property value="postion" /></p>
									<p><s:property value="location" /></p>
								</div>
							</div>
							<div class="search-msg-con col-2">
								<i class="far fa-comment srch-msg-img"></i>
							</div>
						</a>
					</div>
				</s:iterator>


				</div>
			</div>
			
		</div>
	</section>

	<%@include file = "components/footer.jsp" %>
</body>
</html>