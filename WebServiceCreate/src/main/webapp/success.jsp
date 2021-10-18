<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>

<table>
<tr>
<td>Student Id</td>
<td>UserName</td>
<td>Password</td>
<td>Name</td>
<td>Address</td>
<td>Mobile NO</td>
</tr>

<c:forEach items="${data}" var="st">
<tr>
<td>${st.sid}</td>
<td>${st.uname}</td>
<td>${st.pass}</td>
<td>${st.name}</td>
<td>${st.addr}</td>
<td>${st.mono}</td>
</tr>
</c:forEach>

</table>
</form>
</body>
</html>