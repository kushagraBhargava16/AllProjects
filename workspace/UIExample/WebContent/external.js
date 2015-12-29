$(document).on('click', '.remove', function() {
	var id = $(this).closest('tr').attr('id');
	$("#" + id).remove();

});

$(document)
		.ready(
				function() {
					$("#add")
							.click(
									function() {
										var name = prompt("Name of the field.",
												"");
										if (!(name == null || name == "")) {
											var type = prompt("Type of box.",
													"");
											if (!(type == null || type == ""))
												if (type == ("radio")) {

													$("#addHere")
															.append(
																	"<tr  id='"
																			+ name
																			+ "'><th>"
																			+

																			name
																			+ "</th><td><input type='radio' name='radio' value='"+name+"'></td>  <td><input type='button' value='--' class='remove'></td> </tr>");

												} else {

													$("#addHere")
															.append(
																	"<tr  id='"
																			+ name
																			+ "'><th>"
																			+ name
																			+ "</th> <td> <input  name='"
																			+ type
																					.concat(name)
																			+ "' type='"
																			+ type
																			+ "'></td>"
																			+ "<td><input type='button' value='--' class='remove'></td> </tr>");

												}

										}

										else {
											alert("Invalid Entry!");
										}
									});
				});
