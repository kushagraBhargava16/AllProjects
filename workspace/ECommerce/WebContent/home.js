$(document).ready(function() {
	$('#buttonMen').click(function() {
		$("#mensProduct").toggle();
		$("#womensProduct").hide();
		$("#childsProduct").hide();
	});
	$('#buttonWomen').click(function() {
		$("#mensProduct").hide();
		$("#womensProduct").toggle();
		$("#childsProduct").hide();
	});
	$('#buttonChild').click(function() {
		$("#mensProduct").hide();
		$("#womensProduct").hide();
		$("#childsProduct").toggle();
	});
});

$(document).ready(function() {
	$('.addToCartButton').click(function() {
		var id = $(this).closest('table').attr('id');
		var cell1 = document.getElementById(id).rows[1].cells[1].innerHTML;
		var cell2 = document.getElementById(id).rows[2].cells[1].innerHTML;

		/*document.getElementById("name").innerHTML = cell1;
		document.getElementById("price").innerHTML = cell2;
*/
		 
		 var name= document.getElementById("name");
		        name.value=cell1;
		        var price = document.getElementById("price");
		        price.value=cell2; 
		

		$('#dialog').dialog({

			height : 400,
			width : 600
		});
	});
	
	$('#dialogSubmit').click(function() {
		$( "<p>Test</p>" ).appendTo( $("#demo") );
		$("#dialog").dialog('close');

		
	});
	
	

});