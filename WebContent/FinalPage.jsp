<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo Web Page</title>
</head>
<style>
body {background-color:lightgray;
	font-family:verdana;
	font-size:90%;}
h1 {
    color:blue;
    font-family:verdana;
    font-size:150%;
}
p    {color:green}
</style>
<body>
<table>
<tr>
<td>
<p>Your request is submitted for mentioned codes:
<%String fromDD = request.getParameter("fromDD");
String toDD = request.getParameter("toDD");
out.println(fromDD+","+toDD);
%>
</p>
</td>
</tr>
<tr>
<td>
<input type="button" value="OK">
</td>
</tr>
</table>
</body>
</html>