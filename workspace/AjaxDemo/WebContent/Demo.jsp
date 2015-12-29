<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script>
	function load() {
	var	xhttp = new XMLHttpRequest;
	 xhttp.onreadystatechange = function() {
		    if (xhttp.readyState == 4 && xhttp.status == 200) {
		      document.getElementById("demo").innerHTML = xhttp.responseText;
		    }
		
	}
	 xhttp.open("GET", "DemoServlet", true);
	 xhttp.send(); 
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<%!static int count = 0;%>
	<%=(++count)%>
	<button type="button" onclick="load()">Hit</button>

	<p id="demo">
	
	</p>

</body>
</html>