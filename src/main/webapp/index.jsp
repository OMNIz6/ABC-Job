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
		
		<div class="job-content col-11">

			<div class="job-con row">
				<s:iterator value="Jobs">
					<div class="job-holder row col-5">
						<div class="job-img-holder col-6" >
							<img src="./images/job.png">
						</div>
						<div class="job-content-holder col-6" >
							<a href="view_job?id=<s:property value="id" />">
								<div class="job-head-con">
									<p class="job-header"><s:property value = "name"/></p>
								</div>
								<p class="com-name"><s:property value = "comName"/></p>
								<p class="job-location"><s:property value = "lcoation"/></p>
							</a>
						</div>
					</div>
					</s:iterator>
				

			</div>

		</div>
		
	</section>

	<%@include file = "components/footer.jsp" %>
</body>
</html>