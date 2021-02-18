var previousData = null;
$(document).ready(function(){ 
	previousData = JSON.parse(localStorage.updata)
	loadPreviousData(previousData);
	 $("#salaryFormUpdate").validate({
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
				medical_allowance: {
					required: true, 
				},
				overtime_allowance : {
					required: true, 
				},
				month  : {
					required: true, 
				},
				current_year : {
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
				 submitUpdateForm();

			}
		});


	
});

function loadPreviousData (){
	
	  $('#salaryFormUpdate #employee_name').val(previousData.employee_name);
	  $('#salaryFormUpdate #employee_email ').val(previousData.employee_email );
	  $('#salaryFormUpdate #class_name ').val(previousData.class_name );
	  $('#salaryFormUpdate #salary').val(previousData.salary);
	  $('#salaryFormUpdate #travel_allowance').val(previousData.travel_allowance);
	  $('#salaryFormUpdate #medical_allowance ').val(previousData.medical_allowance );
	  $('#salaryFormUpdate #overtime_allowance ').val(previousData.overtime_allowance );
	  $('#salaryFormUpdate #month ').val(previousData.month );
	  $('#salaryFormUpdate #current_year').val(previousData.current_year);
}
function submitUpdateForm(){
	
	var update_salary_info = {
			"type": "update_salary_info",
			"id": previousData.id,
			   "employee_name":$('#salaryFormUpdate #employee_name').val(),
			   "employee_email": previousData.employee_email,
			  "class_name":$('#salaryFormUpdate #class_name').val(),
			  "salary":$('#salaryFormUpdate #salary').val(),
			  "travel_allowance":$('#salaryFormUpdate #travel_allowance').val(),
			  "medical_allowance":$('#salaryFormUpdate #medical_allowance').val(),
			  "overtime_allowance":$('#salaryFormUpdate #overtime_allowance').val(),
			  "month":$('#salaryFormUpdate #month').val(),
			  "current_year":$('#salaryFormUpdate #current_year').val(),
			  
			};  
	
			new UtilWidget()
			.http(update_salary_info)  
			.then(message=> {
	               console.log(message); 
	               message.tag =="success"?$("#salaryFormUpdate")[0].reset():""
	               window.location="salaryList.html"
				}).catch(d=>console.log(d))
	
}
