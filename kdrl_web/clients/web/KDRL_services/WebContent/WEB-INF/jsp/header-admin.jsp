

<div id="head_all">

<header class="site-header">
				<div class="top-header">
					<div class="container">
						<a href="tel:01681193409">Call Us: (880) 01781193409</a>						
						<nav class="member-navigation pull-right">
							<a href="#"><i class="fa fa-user"></i> Register</a>
							<a href="home.html"><i class="fa fa-lock"></i> Logout</a>
						</nav> <!-- .member-navigation -->
					</div> <!-- .container -->
				</div> <!-- .top-header -->

				<div class="bottom-header">
					<div class="container">
						<a href="home.html" class="branding pull-left">
							<img src="rashmomi-theme/images/logo-icon.png" alt="Site title" class="logo-icon">
							<h1 class="site-title"> <span>Rashmoni Cable Network</span></h1> 
							<h2 class="site-description">Dish Cable Provider</h2>
						</a> <!-- #branding -->
						
						<nav class="main-navigation pull-right">
							<button type="button" class="menu-toggle"><i class="fa fa-bars"></i></button>
							<ul class="menu">
								<li class="menu-item"><a href="home.html">Home</a></li>
								<li class="menu-item"><a href="user.html">Client</a></li>
								<li class="menu-item"><a href="user_bill_reaminig.html">Bill Due</a></li>
								<li class="menu-item"><a href="bill_info.html">Bill Info</a></li>
								<li class="menu-item"><a href="agent.html">Agents</a></li>
								<li class="menu-item"><a href="area.html">Area</a></li>
								
							</ul>
						</nav> <!-- .main-navigation -->
					</div> <!-- .container -->
				</div> <!-- .bottom-header -->
			</header> <!-- .site-header -->
</div>

<div class="row" style="height: 10px;"></div>

<div class="row">

	<div class="col-xs-7 col-sm-7 col-md-7 col-lg-7 "></div>
		  <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 ">
		    <form>
    <div class="form-group">     
      <input type="number" class="form-control" id="input_cl_id" placeholder="Enter Client id">
    </div>
       
  </form>
         </div>
         
          <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 ">
		   
             <button id ="btn_get_bill_info" class="btn "  onclick="goToProfile()"  >Submit</button>
       
        </div>
<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 "></div>

</div>


	   <script type="text/javascript">	
		
	   function goToProfile()
	   {
		   var input_id =  document.getElementById("input_cl_id").value;
		   if(input_id == "")
      	 {
      	 alert("Please enter valid id");
      	 return;
      	 }
		   else
			   {
		   window.location.href = "user_profile.html?cl_id= "+input_id;
			   }
	   }
		
		
	</script>



