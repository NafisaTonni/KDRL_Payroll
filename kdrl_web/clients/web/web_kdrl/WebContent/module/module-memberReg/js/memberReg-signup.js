
$(document).ready(function(){ 
	 $("#memberForm").validate({
			rules: {
				name: {
					required: true, 
				},
				company_name: {
					required: true, 
				},
				designation: {
					required: true, 
				},
				official_email: {
					required: true, 
				},
				phone_number: {
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
	
	var add_member_info = {
			"type": "add_member_info",
			   "name":$('#memberForm #name').val(),
			  "company_name":$('#memberForm #company_name').val(),
			  "designation":$('#memberForm #designation').val(),
			  "official_email":$('#memberForm #official_email').val(),
			  "phone_number":$('#memberForm #phone_number').val(),
			};  
			new UtilWidget()
			.http(add_member_info)  
			.then(message=> {
	               console.log(message); 
	               message.tag =="success"?$("#memberForm")[0].reset():""
				}).catch(d=>console.log(d))
	
}
