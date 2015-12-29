<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout!</title><link rel="stylesheet" type="text/css" href="whole.css">

</head>
<body>
<h1>Farewell! ${user.name}</h1>
<% 
session.removeAttribute("userid");
//int name=session.getAttribute("user");
//out.print("<h1>Farewell!");
session.removeAttribute("user");
session.invalidate();
%>
 
<a href="login.jsp"><input type="button" value="Login!"></a>
</body>
</html>