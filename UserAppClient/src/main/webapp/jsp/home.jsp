<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>userhomepage</title>
</head>
<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

	<h2>
		<center>User Details</center>
	</h2>
	<p align="center">
		<!-- --Tab Links -->
	<center>
		<div class="tab">
			<button class="tablinks"
				onClick="location.href = '/UserAppClient/jsp/viewUser.jsp'">View
				User</button>
			<br>
			<br>
			<button class="tablinks"
				onClick="location.href = '/UserAppClient/jsp/addUser.jsp'">Add 
				User</button>
			<br><br>
			<button class="tablinks"
				onClick="location.href = '/UserAppClient/jsp/modifyUser.jsp'">Update
				User</button>
			<br><br>
			<button class="tablinks"
				onClick="location.href = '/UserAppClient/jsp/deleteUser.jsp'">Delete
				User</button>

		</div>

		</p>
		</form>
</body>
</html>