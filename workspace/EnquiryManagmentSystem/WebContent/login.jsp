<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login!</title>
<link rel="stylesheet" type="text/css" href="whole.css">
</head>
<body>
	<center>
	<form method="post" action="LoginActionServlet.do">
		<table>
			<tr>
				<th>Username:</th>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
			
				<th>Password:</th>
				<td><input type="text" name="password"></td>
			</tr>
			
			<tr><td colspan="2">
			<input type="submit" value="submit">
			New User?<a href="registrationForm.jsp" >Register!</a>
			</td></tr>
		</table>
	</form>
	</center>
</body>
</html>