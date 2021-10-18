<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:red">Student Data</h3>
<form action="update">
<table border="1" style="background-color: pink">
<tr>
<th>RollNo</th>
<th>Name</th>
<th>Mobile No</th>
<th>Email Id</th>
<th>Password</th>
<th>Address Id</th>
<th>CityName</th>
<th>AreaName</th>
</tr>

<tr>
<td><input type="number" name="rollno" value=${data.rollno}></td>
<td><input type="text" name="name" value=${data.name}></td>
<td><input type="number" name="mono" value=${data.mono}></td>
<td><input type="email" name="email" value=${data.email}></td>
<td><input type="password" name="pass" value=${data.pass}></td>
<td><input type="text" name="addr.aid" value=${data.addr.aid}></td>
<td><input type="text" name="addr.cityname" value=${data.addr.cityname}></td>
<td><input type="text" name="addr.aname" value=${data.addr.aname}></td>

</tr>



</table>
<input  type="submit" value="update">
</form>
</body>
</html>