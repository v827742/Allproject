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
				<td>UserName:</td>
				<td><input type="text" name="uname"></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="text" name="pass"></td>
			</tr>

			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="male"> Male
				<input type="radio" name="gender" value="female"> female
				<input type="radio" name="gender" value="other"> other<br></td>
			</tr>
			
			<tr>
				<td>D.O.B:</td>
				<td><input type="date" name="DOB" required="required"></td>
			</tr>
             
             <tr>
				<td>Email:</td>
				<td><input type="email" name="email" required="required"></td>
			</tr>
			
			<tr>
				<td>mobile No:</td>
				<td><input type="number" name="mono"></td>
			</tr>
			
			<tr>
				<td>PinCode:</td>
				<td><input type="text" name="addr.pincode"></td>
			</tr>
            
            <tr>
				<td>Area Name:</td>
				<td><input type="text" name="addr.areaname"></td>
			</tr>
			
			<tr>
				<td>City Name:</td>
				<td><input type="text" name="addr.cityname"></td>
			</tr>
			
		</table>
    <input type="submit" value="Register"> 
    <a href="adddata">Add New Address</a>
    
    </form>
</body>
</html>