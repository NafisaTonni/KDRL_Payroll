
<script src="js/staticValue.js"></script>

<div class="row" style="height: 500px;"></div>

<div class="row">
	<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 "></div>



        
	

	<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 "></div>
</div>

<div class="row" style="height: 20px;">
<div id="session_id" style="display: none;"> ${msg_success} </div>
</div>


<script>

console.log( "validate-1: ");
console.log( "validate: "+document.getElementById("session_id").innerHTML);

var area_js = JSON.parse('${js_area_select}');

console.log(area_js);
console.log( "area_js");

sessionStorage.setItem('session_data', document.getElementById("session_id").innerHTML );
sessionStorage.setItem('js_area_select', JSON.stringify(area_js.js_area_select) );
sessionStorage.setItem('js_agent_select', JSON.stringify(area_js.js_agent_select) );



</script>



