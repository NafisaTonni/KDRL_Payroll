<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
				<tiles:importAttribute name="javascripts"/>
				<tiles:importAttribute name="stylesheets"/>

<!DOCTYPE html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">

  <meta name="viewport" content="width=device-width, initial-scale=1" shrink-to-fit=no">
  <!-- put link here not in tiles -->
  <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
  
 					<title>
						<tiles:getAsString name="title" />
					</title>
					
					 <!-- stylesheets -->
				    <c:forEach var="css" items="${stylesheets}">
				        <link rel="stylesheet" type="text/css" href="<c:url value="${css}"/>">
				    </c:forEach>
				    <!-- end stylesheets -->
  
  
</head>

<body class="home page-template-default page page-id-5"> 
	 <div class="wrapper">
			<tiles:insertAttribute name="body" />
			
			 <!-- <nav class="main-heade navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav" style="margin-left: auto !important;"> -->
		<nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
	 		<tiles:insertAttribute name="navbar" />
		</nav>
		
		<div class="page-section" id="contact">
		<tiles:insertAttribute name="contact" />
		</div>
		  
 </div>
 

		
<footer>
	<div class="footer-wrapper">
		<tiles:insertAttribute name="footer" />
	</div>
</footer>
 

<!-- scripts -->
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
	    
   <c:forEach var="script" items="${javascripts}">
       <script src="<c:url value="${script}"/>"></script>
   </c:forEach>
   <!-- end scripts -->

	


</body>
</html>
