<%@page import="com.yash.domain.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%-- <%! static int i=0;%> --%>

<script>
function sendId(){
	var	xhttp = new XMLHttpRequest;
	 xhttp.onreadystatechange = function() {
		    if (xhttp.readyState == 4 && xhttp.status == 200) {
		    	  var table = document.getElementById("table");
		    	    var row = table.insertRow(1);
		    	    var cell1 = row.insertCell(0);
		    	    var cell2 = row.insertCell(1);
		    	    var cell3 = row.insertCell(2); 
		    	  
		    	  /* document.getElementById("demo").innerHTML
		    	 */   
		    	  //document.getElementById()
		    	     cell1.innerHTML ="kush";
		    	    cell2.innerHTML ="kush";
		    	    cell3.innerHTML ="kush"; 
		    	  var employee=eval(xhttp.responseText);
		    	    alert(employee+"hello");
		    	    
		    }
		
	};
	 	var display = document.getElementById('details');
	 	var id=display.id.value.toString();
	 	
	 
	 xhttp.open("GET", "DemoServlet?id="+id, true);
	 xhttp.send(id); 
}
</script>

</head>
<body>
	<form method="get" action="" id="details">
		Search Id:<input type="text" name="id" id="id" align="middle">
		<button type="button" value="Hit" onclick="sendId()">Hit</button>

	</form>
	<table id="table" border="1">
	<tr>
	<th>
	Id</th>
	<th>
	Name</th>
	<th>
	Contact</th>
	</tr>
	</table>
	<p id="demo"></p>
</body>
</html>