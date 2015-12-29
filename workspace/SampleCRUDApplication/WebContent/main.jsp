<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="jquery-ui.js"></script>
<script type="text/javascript" src="external.js"></script>
<link rel="stylesheet" href="global.css">
<link rel="stylesheet" href="jquery-ui.css">

<title>Insert title here</title>
</head>
<body>
	<center>
<form action="" method="get" id="updateForm">
		<table border="1">
			<tr>
				<th>X</th>
				<th>Id</th>
				<th>Name</th>
				<th>Contact</th>
				<th>Address</th>
			</tr>
			<c:forEach var="employee" items="${employees}">
				<tr><th><input type="radio" name="toDelete" id="toDelete" value="${employee.employeeId}"></th>
					<th>${employee.employeeId}</th>
					<th>${employee.employeeName}</th>
					<th>${employee.employeeContact}</th>
					<th>${employee.employeeAddress}</th>

				</tr>
			</c:forEach>

		</table>
		<input type="button" id="update" value="Update!" onclick="check()"> 
</form>
		<input type="button" id="add" value="Add!"> 
			
			<input type="button" id="delete" value="Delete!">
		
	</center>
	<div id="dialog" title="Employee Detials">
		<form action="AddEmployeeServlet" id="details">
			<table border="0">

				<tr>
					<td>Employee Id :</td>
					<td><input type="text" name="id"></td>

				</tr>

				<tr>
					<td>Employee Name :</td>
					<td><input type="text" name="name"></td>

				</tr>
				<tr>
					<td>Employee Contact :</td>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<td>Employee Address :</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="ADD" id="addSubmit"></td>

				</tr>
			</table>
		</form>
	</div>
<!-- 	<div id="dialogUpdate" title="Update Employee">
		<form action="AddEmployeeServlet" id="updateDetails">
			<table border="0">

				<tr>
					<td>Employee Id :</td>
					<td><input type="text" name="id"></td>

				</tr>

				<tr>
					<td>Employee Name :</td>
					<td><input type="text" name="name"></td>

				</tr>
				<tr>
					<td>Employee Contact :</td>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<td>Employee Address :</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="ADD" id="addSubmit"></td>

				</tr>
			</table>
		</form>
	</div> -->

	<div id="dialogDelete" title="Employee Detials">
		<form action="DeleteEmployeeServlet" id="deleteDetails">
			<table border="0">

				<tr>
					<td>Employee Id :</td>
					<td><input type="text" name="id"></td>

				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Delete" id="deleteSubmit"></td>

				</tr>
			</table>
		</form>
	</div>


</body>
</html>