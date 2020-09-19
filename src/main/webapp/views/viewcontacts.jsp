<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts Here</title>
<script>
function deleteconfirm(){
	return confirm("Are you shoure,you want to delete?");
}
</script>
</head>
<body>
<h2><font color='blue'>${viewcontact}</font></h2>
	
	<a href="/">+Add More Contact</a>
	<table border='1'>
		<tr>
			<th>Contact Name</th>
			<th>Contact Email</th>
			<th>Contact Number</th>
			<th>Edit Contact</th>
			<th>Delete Contact</th>
		</tr>
		<c:forEach items="${contacts}" var="contact">
			<tr>
				<td>${contact.contactName}</td>
				<td>${contact.contactEmail}</td>
				<td>${contact.contactNumber}</td>
				<td><a href="editcontact?cid=${contact.contactId}">Edit</a></td>
				<td><a href="deletecontact?cid=${contact.contactId}" onclick="return deleteconfirm()">Delete</a></td>
			</tr>
			
		</c:forEach>
	</table>
	<h2><font color='green'>${deleteMsg}</font></h2>
</body>
</html>