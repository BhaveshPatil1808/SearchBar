<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>first page</title>
</head>
<body>

	<h1>This is home page</h1>
	<h1>called by controller</h1>
	<h1>/home</h1>
	<%
		String name=(String) request.getAttribute("name");
		Integer age = (Integer) request.getAttribute("val");
		
	%>
	<h1>name is <%=name%></h1>
 <h1>age is <%=age %></h1> 
	
	
	<%
	List<String> list = (List<String>) request.getAttribute("city");
	if (list != null) {
		for (String s : list) {
%>
			<h4><%= s %></h4>
<%
		}
	} else {
%>
		<h4>No cities available</h4>
<%
	}
%>

	<a href="about"> go to about page</a>
	<br/>
	<a href="help">help</a>
	
	<br><br/>
	
	
	<a href="form"> go to form</a>
</body>
</html>