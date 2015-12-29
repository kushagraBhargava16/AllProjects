<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="whole.css">

</head>
<body><center>
	<form method="post" action="RegisterActionServlet.do">
		<table>
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>Email ID:</th>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<th>Type:</th>
				<td><input type="text" name="type"></td>
			</tr>
			<tr>
				<th>Status:</th>
				<td><input type="text" name="status"></td>
			</tr>
			<tr>
				<th>Username:</th>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<th>password:</th>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
		</table>
	</form></center>
</body>
</html>