<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
	    <!-- Basic Page Needs -->
    <meta charset="utf-8">
    <!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
    <title>Product</title>

    <meta name="author" content="themesflat.com">

    <!-- Mobile Specific Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- Bootstrap  -->
    <link rel="stylesheet" type="text/css" href="stylesheets/bootstrap.css" >

    <!-- Theme Style -->
    <link rel="stylesheet" type="text/css" href="stylesheets/style.css">

    <!-- Responsive -->
    <link rel="stylesheet" type="text/css" href="stylesheets/responsive.css">

    <!-- Colors -->
    <link rel="stylesheet" type="text/css" href="stylesheets/color1.css" id="colors">

    <!-- REVOLUTION LAYERS STYLES -->
    <link rel="stylesheet" type="text/css" href="stylesheets/layers.css">
    <link rel="stylesheet" type="text/css" href="stylesheets/settings.css">
    
    <!-- Animation Style -->
    <link rel="stylesheet" type="text/css" href="stylesheets/animate.css">

    <!-- Favicon and touch icons  -->
    <link href="icon/apple-touch-icon-48-precomposed.png" rel="icon" sizes="48x48">
    <link href="icon/apple-touch-icon-32-precomposed.png" rel="icon">
    <link href="icon/favicon.png" rel="shortcut icon">
		
</head>


<body class="header_sticky page-loading"> 
  <div class="boxed">

	<div class="row">
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 ">
			<tiles:insertAttribute name="header" />

		</div>
	</div>

	<div class="row">

		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 ">
			<tiles:insertAttribute name="body" />

		</div>
	</div>


	<div class="row">
		<div class="col-xs-12 col-sm-6 col-md-12 col-lg-12 ">
			<tiles:insertAttribute name="footer" />

		</div>
	</div>

</div>
       



 <!-- Javascript -->
    <script src="javascript/jquery.min.js"></script>
    <script src="javascript/bootstrap.min.js"></script> 
    <script src="javascript/jquery.easing.js"></script>   

    <script src="javascript/jquery-waypoints.js"></script> 
    <script src="javascript/jquery-countTo.js"></script>
    <script src="javascript/imagesloaded.min.js"></script>

    <script src="javascript/owl.carousel.js"></script>
    <script src="javascript/jquery-validate.js"></script>

    <script src="javascript/jquery.cookie.js"></script>
    <script src="javascript/html5shiv.js"></script>
    <script src="javascript/respond.min.js"></script>
     
    <script src="javascript/jquery.magnific-popup.min.js"></script>   
      
    <script src="javascript/switcher.js"></script>
     
    <script src="javascript/jquery.fancybox.js"></script>
    
    <script src="javascript/main.js"></script>

    <!-- Revolution Slider -->
    <script src="javascript/jquery.themepunch.tools.min.js"></script>
    <script src="javascript/jquery.themepunch.revolution.min.js"></script>
    <script src="javascript/slider.js"></script>

    <!-- SLIDER REVOLUTION 5.0 EXTENSIONS  (Load Extensions only on Local File Systems !  The following part can be removed on Server for On Demand Loading) -->    
    <script src="javascript/revolution.extension.actions.min.js"></script>
    <script src="javascript/revolution.extension.carousel.min.js"></script>
    <script src="javascript/revolution.extension.kenburn.min.js"></script>
    <script src="javascript/revolution.extension.layeranimation.min.js"></script>
    <script src="javascript/revolution.extension.migration.min.js"></script>
    <script src="javascript/revolution.extension.navigation.min.js"></script>
   
    <script src="javascript/revolution.extension.slideanims.min.js"></script>
    <script src="javascript/revolution.extension.video.min.js"></script>

</body>

</html>
