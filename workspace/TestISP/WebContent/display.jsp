<%@page import="com.yash.domain.Customer"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  %>
	<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
<style>
body {
	
	background-image: url("http://www.samsunggalaxysvii.com/wp-content/uploads/2014/10/android-wallpapers.jpg?836478");
	background-repeat: no-repeat;
}
</style>
</head>
<body>

	<center>
	<h1>Customer List</h1>
	 <table border="1" style="color: red">
		<tr> <th>Id: </th>
		 <th>Name: </th>
		 <th>Address: </th>
		</tr>
	<c:forEach var="customer" items="${customers}" >
	<tr><td>${customer.id}</td>
	<td>${customer.name}</td>
	<td>${customer.address}</td></tr>
	</c:forEach>
		<%-- <jsp:useBean id="customer" scope="request"
			class="com.yash.domain.Customer" />
		Id:
		<jsp:getProperty property="id" name="customer" /><br /> Address:
		<jsp:getProperty property="address" name="customer" /><br /> Name:
		<jsp:getProperty property="name" name="customer" />
		 --%>
		<%--  <table border="1">
		<tr> <th>Id: </th>
		 <th>Name: </th>
		 <th>Address: </th>
		</tr>
		<%
		ArrayList resultSet=(ArrayList)request.getAttribute("customers");
		Iterator iterator=resultSet.listIterator();
		while(iterator.hasNext()){
			Customer customer=(Customer)iterator.next();
			out.print("<tr><td>"+customer.getId()+"</td>");
			out.print("<td>"+customer.getName()+"</td>");
			out.print("<td>"+customer.getAddress()+"</td></tr>");
			
		}
		%></table> --%>
		
		
		
<%-- 		<table border="1">
	<tr><th>name:</th><td> ${customers[0].getName()}</td></tr>
	<tr><th>id:</th><td> ${customers[0].id lt "101"}</td></tr>
	<tr><th>ADDRESS:</th><td> ${customers[0].address}</td></tr>
	</table> --%>

	</center>


</body>
</html>