

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rashmoni</title>
</head>
<body>


<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> -->

<script src="https://code.jquery.com/jquery-3.4.1.min.js" ></script>

	   <script type="text/javascript">	
		
	   $.ajax({
		    url: 'http://localhost:8080/eschool/restservice_post.html',
		    dataType: 'json',
		    type: 'post',
		    contentType: 'application/json',
		    data: JSON.stringify( { "type":"test", "first-name": "Niup", "last-name": "Halder" } ),
		    processData: false,
		    success: function( data, textStatus, jQxhr ){
                var data_tmp = data;
				console.log(data_tmp);
		    },
		    error: function( jqXhr, textStatus, errorThrown ){
		        console.log( errorThrown );
		    }
		});
	   
	   
		
	</script>
</body>
</html>
