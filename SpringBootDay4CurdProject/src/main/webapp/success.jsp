<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
function updateData()
{
 alert("update procces");
 document.fm.action="edit";
 document.fm.submit();
}

function deleteData()
{
 alert("delete procces");
 document.fm.action="delete";
 document.fm.submit();
}

function addData()
{
 alert("Add procces");
 document.fm.action="register.jsp";
 document.fm.submit();
}
</script>
</head>
<center>
<body>
<form name="fm">
<h4><font color="red">STUDENT DATA TABLE</font></h4>
<table border="3" style="color:blue; background-color: pink">
            
                <tr>
                    <th>Student Id</th>
                    <th>RollNo</th>
                    <th>UserName</th>
                    <th>Password</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Mobile No</th>
                </tr>
            
            
                <c:forEach items="${data}" var="em">
                    <tr>
                        <td><input type="radio" name=sid value="${em.sid}">
                            ${em.sid}</td>
                        <td>${em.rollno}</td>
                        <td>${em.uname}</td>
                        <td> ${em.pass}</td>
                         <td> ${em.name}</td>
                        <td> ${em.addr}</td>
                        <td> ${em.mono}</td>
                    </tr>
                </c:forEach>
            
        </table>
        <input type="button" value="update" onclick="updateData()">
         <input type="button" value="Delete" onclick="deleteData()">
          <input type="button" value="Add" onclick="addData()">
</form>
</body>
</html>