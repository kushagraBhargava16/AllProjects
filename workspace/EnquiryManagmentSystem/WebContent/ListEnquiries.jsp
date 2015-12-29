<%@page import="com.yash.enquirymanagment.domain.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enquiries</title>
<link rel="stylesheet" type="text/css" href="whole.css">

</head>
<body>
<%
User user=(User)session.getAttribute("user");
String name=user.getName();
out.print("<div>");
out.print("Welcome!"+name.toUpperCase());
out.print("</div>");
%>
	<center>

		<h1>The Enquiry</h1>
		<form action="ListEnquiryActionServlet.do" method="post">
			<table border="1">
				<tr>
				<!-- 	<th></th> -->
					<th colspan="2" >Enquiry ID</th>
					<th>Name</th>
					<th>Contact</th>
					<th>Email</th>
					<th>User Id</th>
					<th >Courses</th>
					<th></th>

				</tr>
				<c:forEach var="enquiry" items="${enquiries}">
					<tr>
						<td><input type="checkbox" name="deleteEnquiry"
							value=${enquiry.enquiryid}></td>
						<td>${enquiry.enquiryid}</td>
						<td>${enquiry.name}</td>
						<td>${enquiry.contact}</td>
						<td>${enquiry.email}</td>
						<td>${enquiry.userid}</td>
						<td>${enquiry.courses}</td>

						<td></td>
						<!-- onclick="location.href='ListEnquiryActionServlet.do'" -->
						
					</tr>
				</c:forEach>
				<tr>
					<td colspan="8" align="center">
					<input type="button"
						value="Add Enquiry!" name="button"
						onclick="location.href='addEnquiry.jsp'" />
						 <input type="submit"
						value="Delete All Enquiries!" name="button" />
						<input type="submit" name="button"
							value="Delete Selected!"></td>
				</tr>
			</table>
		</form>
		<a href="logout.jsp"><input type="button" value="Logout!"></a>

	</center>
</body>
</html>