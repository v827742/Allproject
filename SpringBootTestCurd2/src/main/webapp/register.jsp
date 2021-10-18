<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reg">
<table>
<tr>
<td>User Id:</td>
<td><input type="text" name="uid"></td>
</tr>

<tr>
<td>UserName:</td>
<td><input type="text" name="uname"></td>
</tr>

<tr>
<td>PassWord:</td>
<td><input type="password" name="pass"></td>
</tr>

<tr>
<td>Name:</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Address:</td>
<td><input type="text" name="address"></td>
</tr>

<tr>
<td>Mobile NO:</td>
<td><input type="number" name="mono"></td>
</tr>

</table>
<input type="submit" value="Register">
<a href="index.jsp">LoginPage</a>
</form>
</body>
</html>