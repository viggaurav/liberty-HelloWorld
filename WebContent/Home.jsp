<%@page import="com.acn.schema.jaxb.response.Output.CDBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.util.*" %>
<%@ page import= "com.acn.schema.jaxb.response.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo Web App</title>
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
<h1>Demo Web App - Code Decode Service</h1>

<form method = "POST" action = "FinalPage.jsp">

 <table style="width:100%">
 <tr>
 <td align="left">
 <label>First Name: </label>
 </td>
<td align="left">
 <input type=text value="" >
 </td>
<td align="left">
 <label>Last Name: </label>
 </td><td>
 <input type=text value="">
 </td>

 </tr>
<tr>
<td align="left">
 <label>From: </label>
 </td>
<td align="left">
	<select name="fromDD">
	<%
	System.out.println("Fetching output from request");
	Output reqObj =(Output)request.getAttribute("resObj");
	List<CDBeans> beans  = (List<CDBeans>)reqObj.getCDBeans();
	for (CDBeans s:beans){
	out.println("<option value="+s.getCodes()+">"+s.getDecodes()+"</option>");
	}
	%>
	</select>
</td>
<td align="left">
 <label>To: </label>
 </td>

<td>
<select name="toDD">
	<%
	System.out.println("Fetching output to request");
	Output toResObj =(Output)request.getAttribute("toResObj");
	List<CDBeans> toBeans  = (List<CDBeans>)toResObj.getCDBeans();
	for (CDBeans e:toBeans){
	out.println("<option value="+e.getCodes()+">"+e.getDecodes()+"</option>");
	}
	%>

</select>
</td>

</tr> 
 </table>
 
 
<input type ="SUBMIT" value = "Submit Request">
</form>
</body>
</html>