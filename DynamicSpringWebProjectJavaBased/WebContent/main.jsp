<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>



<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function product() {
	alert("ok")
	document.myform.action="pro";
	document.myform.submit();
	
}
function order() {
	alert("ok")
	document.myform.action="ord";
	document.myform.submit();
	
}

</script>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<center>
<body>
<form name="myform">
<input type="button" value="productDetails" onclick="product()">
<input type="button" value="orderDetails" onclick=" order() ">
</form>
</body>
</html>