
$(document).ready(function(){ 
	 $("#salaryForm").validate({
			rules: {
				employee_name: {
					required: true, 
				},
				employee_email : {
					required: true, 
				},
				class_name : {
					required: true, 
				},
				salary: {
					required: true, 
				},
				travel_allowance: {
					required: true, 
				},
				medical_allowance  : {
					required: true, 
				},
				overtime_allowance  : {
					required: true, 
				},
				month   : {
					required: true, 
				},
				current_year  : {
					required: true, 
				},
				
			}, 
	         messages: {
	        	 
	 		},
			errorElement: "em",
			errorPlacement: function (error, element) {
				// Add the `invalid-feedback` class to the error element
				error.addClass("invalid-feedback");

				if (element.prop("type") === "checkbox") {
					error.insertAfter(element.next("label"));
				} else {
					error.insertAfter(element);
				}
			},
			highlight: function (element, errorClass, validClass) {
				$(element).addClass("is-invalid").removeClass("is-valid");
			},
			unhighlight: function (element, errorClass, validClass) {
				$(element).addClass("is-valid").removeClass("is-invalid");
			},
			submitHandler: function (form) { 
				 submitSignupForm();

			}
		});


	
});

function submitSignupForm(){
	
	var add_salary_info = {
			"type": "add_salary_info",
			   "employee_name":$('#salaryForm #employee_name').val(),
			  "employee_email":$('#salaryForm #employee_email').val(),
			  "class_name":$('#salaryForm #class_name').val(),
			  "salary":$('#salaryForm #salary').val(),
			  "travel_allowance":$('#salaryForm #travel_allowance').val(),
			  "medical_allowance":$('#salaryForm #medical_allowance').val(),
			  "overtime_allowance":$('#salaryForm #overtime_allowance').val(),
			  "month":$('#salaryForm #month').val(),
			  "current_year":$('#salaryForm #current_year').val(),
			};  
	
			new UtilWidget()
			.http(add_salary_info)  
			.then(message=> {
	               console.log(message); 
	               message.tag =="success"?$("#salaryForm")[0].reset():""
				}).catch(d=>console.log(d))
			//console.log(add_salary_info);
	
}
