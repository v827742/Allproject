<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<style>
body{
  background-image:url("E:/wall/OTHER/FRMAG043.JPG");
  table-layout: center;

}

 
</style>
</head>
<center>
<body>
 
<form action="reg">
<h3 style="color:tomato"> STUDENT REGISTRATION FORM </h3>
<h2 style="color:tomato">2021-2022</h2>
<table border="1" style="color:DodgerBlue">

<tr>
<th>RollNo :</th>
<td><input type="number" name="rollno"></td>
</tr>

<tr>
<th>Name :</th>
<td><input type="text" name="name"></td>
</tr>

<tr>
<th>Mobile No :</th>
<td><input type="number" name="mono"></td>
</tr>

<tr>
<th>Email Id :</th>
<td><input type="email" name="email"></td>
</tr>

<tr>
<th>PassWord :</th>
<td><input type="password" name="pass"></td>
</tr>

<tr>
<th>Address Id:</th>
<td><input type="text" name="addr.aid"></td>
</tr>

<tr>
<th>CityName:</th>
<td><input type="text" name="addr.cityname"></td>
</tr>

<tr>
<th>Area Name:</th>
<td><input type="text" name="addr.aname"></td>
</tr>



</table>
<input type="submit" value="Register">
</form>
</body>
</html>