<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">

function loginData() {
	
	alert("hello Loging");
	
	var uname=document.getElementById("un").value;
	var pass=document.getElementById("ps").value;
	
	alert(uname+" "+pass);
	
	var req=new XMLHttpRequest();
	
	
	var url="http://aashish:5053/getData/"+uname+"/"+pass+"";
	
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
<body>
	<table>
		<tr>
			<td>UserName</td>
			<td><input type="text" name="uname" id="un"></td>
		</tr>

		<tr>
			<td>PassWord</td>
			<td><input type="text" name="pass" id="ps"></td>
		</tr>

	</table>
	<input type="button" value="login" onclick="loginData()">
<a href="reg">SignUp</a>
</body>
</html>