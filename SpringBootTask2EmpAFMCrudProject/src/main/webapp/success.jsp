<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
            <thead>
                <tr>
                    <th>Employee Id</th>
                    <th>UserName</th>
                    <th>Password</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Mobile No</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${data}" var="em">
                    <tr>
                        <td><c:out value="${em.eid}"></c:out></td>
                        <td><c:out value="${em.uname}"></c:out></td>
                        <td><c:out value="${em.pass}"></c:out></td>
                         <td><c:out value="${em.name}"></c:out></td>
                        <td><c:out value="${em.addr}"></c:out></td>
                        <td><c:out value="${em.mono}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

</body>
</html>