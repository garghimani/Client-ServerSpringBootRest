<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>modifyuser</title>
</head>
<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

	<form method="post" modelAttribute="user"
		action="/UserAppClient/modifyUser.do">
		<h2>
			<center>Modify User</center>
		</h2>
		<center>
			<table cellpadding="0" cellspacing="0" width="50%"">
				<tr>


					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User Id</td>
					<td><input type="text" name="id" maxlength="10"
						value="" /></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><br>
						<table width="50%">
							<tr>
								<td><input type="submit" name="Modify" value="Modify" /></td>
							</tr>
						</table></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>