<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Enquiry!</title>
<link rel="stylesheet" type="text/css" href="whole.css">

</head>
<body>

<center>
<h1>
Enquiry Form!
</h1>

	<form method="post" action="ListEnquiryActionServlet.do">
		<table border="1">
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>Email Id:</th>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<th>Contact:</th>
				<td><input type="text" name="contact"></td>
			</tr>
			<tr>
				<th>Courses:</th>
				<td>
				<input type="checkbox" name="courses" value="Java">Java
				<input type="checkbox" name="courses" value="Servlet">Servlet
				<input type="checkbox" name="courses" value="JSP">JSP<br>
				<input type="checkbox" name="courses" value="HTML">HTML
				<input type="checkbox" name="courses" value="DBMS">DBMS
				</td>
			</tr>
			<tr>
			<td colspan="2" align="center">
			<input type="submit" value="submit" name="submit">
			</td>
			</tr>
		</table>
	</form>
		<a href="logout.jsp" ><input type="button" value="Logout!" ></a>
	
	</center>
</body>
</html>