<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Student Confirmation Page</title>
</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName} 
<br><br>
His country: ${student.country} 
<br><br>
His favorite programming language: ${student.language} 
<br><br>
His operating systems: 
<ul>
			<c:forEach var="temp" items="${student.operatingSystem}">
   			  	<li>${temp}</li>
            </c:forEach>
</ul>

<br><br>
</body>

</html>