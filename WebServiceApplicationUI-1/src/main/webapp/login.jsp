<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
function login() 
{
	alert("Login Ok");
	
	var uname=document.getElementById("uname").value;
	var pass=document.getElementById("pass").value;
	
	alert(uname);
	alert(pass);
	
	var req=new XMLHttpRequest();
	
	var url="http://localhost:4041/getData/"+uname+"/"+pass+"";
	req.open("GET",url,true);
	req.send();
	alert("success");
	req.onreadystatechange=function()
	{
		alert(req.readyState);
		alert(req.status);
		if(req.readyState==4&&req.status==200)
			{
			alert("success1");
			alert(req.responseText);
			}
			
	}
}
</script>
</head>
<body>


<table>
<tr>
<th>UserName</th>
<td><input type="text" name="uname" id="uname"></td>
</tr>

<tr>
<th>PassWord</th>
<td><input type="password" name="pass" id="pass"></td>
</tr>

</table>
<input type="button" value="login" onclick="login()">
<a href="reg">New User</a>
</body>
</html>