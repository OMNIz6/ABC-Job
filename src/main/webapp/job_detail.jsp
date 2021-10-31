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
		
				<div class="job-detail-content col-9">
				<div class="job-detail-holder">
					<div class="detail-header row">
						<div class="detail-img col-4">
							<img src="./images/job.png">
						</div>

						<div class="detail-header-content col-lg-8">
							<div class="detail-heading text-center">
								<h1><s:property value="job.name"/>  </h1>
							</div>
							<div class="detail-header-des row">
								<p class="detail-header-text col-5 row">
									<span class="bold-des col-5">Company :</span>
									<span class="col-7"><s:property value="job.comName"/> </span>
								</p>
								<p class="detail-header-text col-5 row">
									<span class="bold-des col-5">Location :</span>
									<span class="col-7"><s:property value="job.lcoation"/> </span>
								</p>
								<p class="detail-header-text col-5 row">
									<span class="bold-des col-5">Time :</span>
									<span class="col-7"><s:property value="job.time"/> </span>
								</p>
								<p class="detail-header-text col-5 row">
									<span class="bold-des col-5">Posted on:</span>
									<span class="col-7"><s:property value="job.date"/> </span>
								</p>
								<p class="detail-header-text col-3 row mx-auto" >
									<span class="bold-des col-5">Salary:</span>
									<span class="col-7"><s:property value="job.salary"/></span>
								</p>
							</div>
							<a href="apply?jid=<s:property value="job.id"/>" class="apply-btn text-center">Apply</a>
						</div>

						
					</div>
					
					<hr>
					<div class="detail-des">
						<h2 class="bold-des">Description</h2>
						<p>
							<s:property value="job.description"/>
						</p>
					</div>

				</div>

		</div>
		
	</section>

	<%@include file = "components/footer.jsp" %>
</body>
</html>