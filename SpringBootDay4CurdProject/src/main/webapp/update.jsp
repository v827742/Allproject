<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body>
<form action="update">
<h4>EDIT DATA FROM TABLE</h4>
<table border="1">
  <thead>
                <tr>
                    <th>Student Id</th>
                    <th>RollNo</th>
                    <th>UserName</th>
                    <th>Password</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Mobile No</th>
                </tr>
            </thead>
            <tbody>
                    <tr>
                        <td><input type="hidden" name=sid value="${data.sid}">
                          <td><input type="number" name=rollno value="${data.rollno}">
                        <td><input type="text" name=uname value="${data.uname}">
                        <td><input type="password" name=pass value="${data.pass}">
                        <td><input type="text" name=name value="${data.name}">
                        <td><input type="text" name=addr value="${data.addr}">
                        <td><input type="number" name=mono value="${data.mono}">
                        
                          
                       </td>
            </tbody>
</table>
<input type="submit" value="Update">
</form>
</body>
</html>