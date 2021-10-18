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
                    <th>Employee Id</th>
                    <th>UserName</th>
                    <th>Password</th>
                    <th>Name</th>
                    <th>Address</th>
                     <th>Email</th>
                    <th>Mobile No</th>
                     <th>Salary</th>
                </tr>
            </thead>
            <tbody>
                    <tr>
                        <td><input type="number" name=empid value="${data.empid}">
                        <td><input type="text" name=uname value="${data.uname}">
                        <td><input type="password" name=pass value="${data.pass}">
                        <td><input type="text" name=name value="${data.name}">
                        <td><input type="text" name=addr value="${data.addr}">
                         <td><input type="email" name=email value="${data.email}">
                        <td><input type="number" name=mono value="${data.mono}">
                         <td><input type="number" name=salary value="${data.salary}">
                        
                          
                       </td>
            </tbody>
</table>
<input type="submit" value="Update">
</form>
</body>
</html>