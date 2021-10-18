<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="log">
		<table>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="uname"></td>
			</tr>

			<tr>
				<td>PassWord:</td>
				<td><input type="text" name="pass"></td>
			</tr>


		</table>
		<input type="submit" value="login">
		<a href="register">NewUser?</a>
	</form>
</body>
</html>