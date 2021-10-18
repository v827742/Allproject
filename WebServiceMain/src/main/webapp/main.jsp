<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function createPage() {
	alert("To create");
	document.fm.action="http://localhost:1002/";
	document.fm.submit();
}
function ReadPage() {
	alert("To create");
	document.fm.action="http://localhost:1004/";
	document.fm.submit();
}
function updatePage() {
	alert("To create");
	document.fm.action="http://localhost:1005/";
	document.fm.submit();
}
function deletePage() {
	alert("To create");
	document.fm.action="http://localhost:1003/";
	document.fm.submit();
}

</script>
</head>
<body>
<form name="fm">



<input type="button" value="Create" onclick="createPage()">
<input type="button" value="Read" onclick="ReadPage()">
<input type="button" value="Update" onclick="updatePage()">
<input type="button" value="Delete" onclick="deletePage()">

</form>
</body>
</html>