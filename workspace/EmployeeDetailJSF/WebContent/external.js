$(document).ready(function() {
	$("#dob").datepicker({
		dateFormate : 'yy/mm/dd',
		changeMonth : 'true',
		changeYear : 'true',
		yearRange : '-100y:c+nn',
		maxDate : '-1d'
	});

});

/*
 * $(document).ready(function() { $('#terms').change(function(){
 * $('#submit').prop('disabled',false); }); });
 */
/*
 * $(document).ready(function(){ $('#terms').click(function(){
 * if($('#terms').is(':checked')){ $('#submit').prop('disabled',false);
 * 
 * }else{ $('#submit').prop('disabled',true);
 *  } });
 * 
 * });
 */
$(document).ready(function() {
	$('#reset').click(function() {
		// location.reload(true);
		document.getElementById("name").value = " ";
		document.getElementById("gender").innerHTML.checked = false;
		document.getElementById("contact").value = " ";
		document.getElementById("email").value = " ";
		document.getElementById("address").value = " ";
		document.getElementById("dob").value = " ";
		document.getElementById("experience").value = " ";
		document.getElementById("techKnown").innerHTML.checked = false;
	});
});


