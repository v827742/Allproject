<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function RegData() 
{
	alert("reg ok.");
	
	
	var rollno=document.getElementById("rollno").value;
	var name=document.getElementById("name").value;
	var addr=document.getElementById("addr").value;
	
	
	var req=new XMLHttpRequest();
	var url="http://localhost:5053/postData";
	
	req.open("POST",url,true);
	
	var data= {
		    rollno: rollno,
		    name:name,
		   addr:addr,
		   
		}
	alert(data);
	
     var stu=JSON.stringify(data);
     alert(stu);
	req.setRequestHeader("Content-Type", "application/json");
	
	
	req.send(stu);
	alert("success");
	req.onreadystatechange=function()
	{
		alert(req.readyState);
		alert(req.status);
		if(req.readyState==4 && req.status==200)
			{
			alert("Successful");
			 alert(req.responseText);
			}
	}
	
}
</script>
</head>
<body>
<table>


<tr>
<th>Rollno:</th>
<td><input type="text" name="rollno" id="rollno"></td>
</tr>

<tr>
<th> Name:</th>
<td><input type="text" name="name" id="name"></td>
</tr>

<tr>
<th> address:</th>
<td><input type="text" name="addr" id="addr"></td>
</tr>



</table>
<input type="submit" vlaue="Register" onclick="RegData()">
</body>
</html>