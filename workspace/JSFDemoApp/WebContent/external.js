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

function read(input) {

	if (input.files && input.files[0]) {
		var reader = new FileReader();

		reader.onload = function(e) {
			$('#image').attr('src', e.target.result).width(100).height(100);
		};

		reader.readAsDataURL(input.files[0]);
	}

}

$(document)
		.ready(
				function() {
					$("#submit")
							.click(
									function() {
										var display = document
												.getElementById('details');
										var image = document
												.getElementById("image").src;
										var name = display.name.value
												.toString();
										var contact = display.contact.value
												.toString();
										var email = display.email.value
												.toString();
										$("#left")
												.append(
														"<div class='removeDiv' id='"+name+contact+email+"'> <input type='button' value='X' class='remove' style='margin-left:85%'> <br/> <img src='"
																+ image
																+ "' alt='Smiley face' height='90' width='90' class='images' > <br/> Name: "
																+ name
																+ " <br/> Contact: "
																+ contact
																+ "<br/> Email: "
																+ email
																+ "</div>");
										$("#dialog").dialog('close');
										
									});
				});

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
