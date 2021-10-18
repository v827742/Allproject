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
	alert("Login OK.");
	
	var un=document.getElementById("un").value;
	var ps=document.getElementById("ps").value;
	
	alert(un);
	alert(ps);
	
	var req=new XMLHttpRequest();
	var url="http://localhost:2327/getAllData/"+un+"/"+ps+"";
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
		}}
	
}
</script>
</head>
<body>
UserName:<input type="text" name="un" id="un">
<br>
Password:<input type="password" name="ps" id="ps">
<br>
<input type="button" value="login" onclick="login()">
</body>
</html>