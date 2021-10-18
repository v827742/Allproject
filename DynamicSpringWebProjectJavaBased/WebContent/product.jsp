<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<center>
<body>
<form action="prdct">

<table class="table">
<tr>
<td>Product ID:</td>
<td><input type="number" name="pid"></td>
</tr>

<tr>
<td>Product Name:</td>
<td><input type="text" name="pname"></td>
</tr>

<tr>
<td>Brand Name:</td>
<td><input type="text" name="pbrand"></td>
</tr>

<tr>
<td>pkg Date:</td>
<td><input type="date" name="pkgdate"></td>
</tr>

<tr>
<td>Exp Date:</td>
<td><input type="date" name="expdate"></td>
</tr>

<tr>
<td>MRP Price:</td>
<td><input type="text" name="mrp"></td>
</tr>

</table>
<input type="submit" value="OK">

</form>

</body>
</html>