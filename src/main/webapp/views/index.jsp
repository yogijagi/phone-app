<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Home Page</title>
</head>
<body>
	<h2>welcome to index page</h2>
	<h2><font color='green' style="text-align:center">${succMsg}</font></h2>
	<h2><font color='red' style="text-align:center">${errMsg}</font></h2>
	<form:form action="/saveContact" method="POST" modelAttribute="contact">
		<table>
			<tr>
				<td>Contact Name</td>
				<td><form:input path="contactName" /></td>
				<form:hidden path="contactId"/>
			</tr>
			<tr>
				<td >Contact Email</td>
				<td ><form:input path="contactEmail" /></td>
			</tr>
			<tr>
				<td>Contact Number</td>
				<td><form:input path="contactNumber" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save Contact" /></td>
			</tr>
		</table>
	</form:form>
	<a href="viewcontacts">views all contacts here</a>
</body>
</html>