
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Entry Form!</title>
<script type="text/javascript">
	function did(){
		
	}
</script>
</head>
<body>


<center>
	<form action="DisplayServlet" method="get">
		<table>
			<tr>
				<th>Id:</th>
				<td><fe:formElement inputType="text" inputName="id" inputValue="" /></td>
			</tr>
			<tr>
				<th>Name:</th>
				<td><fe:formElement inputType="text" inputName="name" inputValue=""
						 /></td>
			</tr>
			<tr>
				<th>Address:</th>
				<td><fe:formElement inputType="text" inputName="address" inputValue=""
						 /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><fe:formElement inputType="submit"
						inputName="submit" inputValue="submit" /></td>
			</tr>
		</table>
	</form>
	</center>
	
</body>
</html>