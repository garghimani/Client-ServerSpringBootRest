<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Details</title>
</head>
<body bgcolor="#ffffee">
	<center>
		<h1>
			<font color=red>User Details</font>
		</h1>
	</center>
	<center>
		<table border="1" align="center" style="width: 50%">
			<thead>
				<tr>
					<th>User ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Address</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${user.id}</td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.address}</td>
				</tr>
			</tbody>

		</table>

		<table width="50%">
			<tr>
				<td><input type="button"
					onClick="location.href = '/UserAppClient/jsp/home.jsp'"
					value="Home Page" style="margin: 0 34" /></td>
			</tr>
		</table>
	</center>
</body>
</html>