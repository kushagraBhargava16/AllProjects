/**
 * 
 */

$(document).ready(function() {
	$('#add').click(function() {
		$("#dialog").dialog({

			height : 380,
			width : 700
		});
	});
});
$(document).ready(function() {
	$('#delete').click(function() {
		$("#dialogDelete").dialog({
			
			height : 380,
			width : 700
		});
	});
});
$(document).ready(function() {
	$('#update').click(function() {
		$("#dialogUpdate").dialog({
			
			height : 380,
			width : 700
		});
	});
});

function check(){
alert("kusha");
	var deleteId = document.getElementById('updateForm');
var idValue=deleteId.toDelete.value.toString();
if(idValue.isEmpty()){
	alert("khali he be");
}
else{
	alert(idValue);
}
}


function close(){
	$("#dialog").dialog('close');
	$("#dialogDelete").dialog('close');
	$("#dialogUpdate").dialog('close');

}
/*
$(document).on('click', '.remove', function() {
	$(this).closest('div').remove();

});

$(document).on('click','.images',function(){
	//alert("hello");
	var id=$(this).closest('div').attr('id');
//alert(id);
	$('#rightUpper').empty();
$('#'+id).clone().appendTo('#rightUpper');
});
*/