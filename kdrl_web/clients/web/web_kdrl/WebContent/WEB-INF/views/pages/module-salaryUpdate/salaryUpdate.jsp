       <!-- Masthead-->
        <header class="masthead bg-primary text-white text-center">
            <div class="container d-flex align-items-center flex-column">
                <!-- Masthead Avatar Image-->
                <img class="masthead-avatar mb-5" src="assets/img/kdrl.png" alt="" />
                <!-- Masthead Heading-->
                <h2 class="masthead-heading text-uppercase mb-0">King Digital Recharge Limited.</h2>
                <!-- Icon Divider-->
                <div class="divider-custom divider-light">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- Masthead Subheading-->
                <p class="masthead-subheading font-weight-light mb-0">We Think & Work Digitally</p>
            </div>
        </header>
            <!-- Application-->
    <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
                <div class="wrapper wrapper--w790">
                    <div class="card card-5">
                    
                    <!--------------- logo ---------------------> 
                        <div class="row center">
                     <div class="col-12">
                          <div class="card-heading">
                            <h2 class="title">Salary Update Form</h2>
                        </div>
                     </div>
                </div>
                        <div class="card-body">
                            <form id="salaryFormUpdate"  class="form-horizontal">
                                <div class="form-row m-b-55">
                                
                                  <!---------------  Employee Name --------------------->
                                    <div class="col-lg-12">
                                		<div class="input-group input-group-sm pt-1">
                                    		<div class="input-group-prepend">
                                        		<span class="input-group-text"> Employee Name</span>
                                    		</div>
                                        <input name="employee_name" id="employee_name" type="text" class="form-control" placeholder="Text.. " >
                                		</div>
                          			</div>
                              
                              <!---------------  Employee Email --------------------->  
                                <div class="col-lg-12">
                                		<div class="input-group input-group-sm pt-1">
                                    		<div class="input-group-prepend">
                                        		<span class="input-group-text"> Employee Email</span>
                                    		</div>
                                        <input name="employee_email" id="employee_email" type="text" class="form-control" placeholder="Text.. " readonly>
                                		</div>
                          			</div>
                                <!---------------  Class Name --------------------->  
                                <div class="col-lg-12">
                                		<div class="input-group input-group-sm pt-1">
                                    		<div class="input-group-prepend">
                                        		<span class="input-group-text"> Class Name</span>
                                    		</div>
                                    		<select id="class_name" name="class_name" class="form-control" placeholder="Select Class ">
                                    				<option value="..">Select Class</option>
  													<option value="Class_1">Class 1</option>
  													<option value="Class_2">Class 2</option>
  													<option value="Class_3">Class 3</option>
  													<option value="Class_4">Class 4</option>
											</select>
                                    		<!----<input name="class_name" id="class_name" type="text" class="form-control" placeholder=" " >---->
                                        
                                		</div>
                          			</div>
                                <!---------------  salary ---------------------> 
                                <div class="col-lg-12">
                                		<div class="input-group input-group-sm pt-1">
                                    		<div class="input-group-prepend">
                                        		<span class="input-group-text"> Salary</span>
                                    		</div>
                                        <input name="salary" id="salary" type="text" class="form-control" placeholder="Text.." >
                                		</div>
                          			</div>
                          		<!--------------- Travel Allowance --------------------->
                          		<div class="col-lg-12">
                                		<div class="input-group input-group-sm pt-1">
                                    		<div class="input-group-prepend">
                                        		<span class="input-group-text"> Travel Allowance</span>
                                    		</div>
                                        <input name="travel_allowance" id="travel_allowance" type="text" class="form-control" placeholder=" Text.." >
                                		</div>
                          			</div>
                          			<!--------------- medical_allowance --------------------->
                          			<div class="col-lg-12">
                                		<div class="input-group input-group-sm pt-1">
                                    		<div class="input-group-prepend">
                                        		<span class="input-group-text"> Medical Allowance</span>
                                    		</div>
                                        <input name="medical_allowance" id="medical_allowance" type="text" class="form-control" placeholder="Text.. " >
                                		</div>
                          			</div>
                          			<!--------------- overtime_allowance --------------------->
                          			<div class="col-lg-12">
                                		<div class="input-group input-group-sm pt-1">
                                    		<div class="input-group-prepend">
                                        		<span class="input-group-text"> Overtime Allowance</span>
                                    		</div>
                                        <input name="overtime_allowance" id="overtime_allowance" type="text" class="form-control" placeholder=" Text.." >
                                		</div>
                          			</div>
                          			<!--------------- Month --------------------->
                          			<div class="col-lg-12">
                                		<div class="input-group input-group-sm pt-1">
                                    		<div class="input-group-prepend">
                                        		<span class="input-group-text"> Month</span>
                                    		</div>
                                    		<select id="month" name="month" class="form-control" placeholder="Text.. ">
                                    				<option value="..">Select month</option>
  													<option value="january">January</option>
  													<option value="february">February</option>
  													<option value="march">March</option>
  													<option value="april">April</option>
  													<option value="may">May</option>
  													<option value="june">June</option>
  													<option value="july">July</option>
  													<option value="august">August</option>
  													<option value="september">September</option>
  													<option value="october">October</option>
  													<option value="november">November</option>
  													<option value="december">December</option>
											</select>
                      <!--------<input name="month" id="month" type="text" class="form-control" placeholder=" " >-------->
                                        
                                		</div>
                          			</div>
                          			<!--------------- Current Year --------------------->
                          			<div class="col-lg-12">
                                		<div class="input-group input-group-sm pt-1">
                                    		<div class="input-group-prepend">
                                        		<span class="input-group-text"> Current Year</span>
                                    		</div>
                                    		<select id="current_year" name="current_year" class="form-control" placeholder="Text..">
                                    				<option value="..">Select Year</option>
  													<option value="a">2015</option>
  													<option value="s">2016</option>
  													<option value="d">2017</option>
  													<option value="f">2018</option>
  													<option value="g">2019</option>
  													<option value="h">2020</option>
  													<option value="j">2021</option>
  													<option value="k">2022</option>
  													<option value="q">2023</option>
  													<option value="w">2024</option>
  													<option value="e">2025</option>
  													<option value="r">2026</option>
  													<option value="t">2027</option>
  													<option value="y">2028</option>
  													<option value="u">2029</option>
  													<option value="i">2030</option>
  													
											</select>
                             <!---<input name="current_year" id="current_year" type="text" class="form-control" placeholder=" " >---->
                                    		
                                		</div>
                          			</div>
                                <!---------------  Button ---------------------> 
                                <div class="modal-footer">
                                <button type="submit"  class="btn btn--radius-2 btn--red-2" id= "btnSubmitForm" style="background-color:#b721ff !important">Submit</button>
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>