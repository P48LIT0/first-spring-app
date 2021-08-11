<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
	<title>Write down your favourite car mark</title>
	<style>
	.error {color:red}
	</style>
</head>
Write down your favourite car mark
<body>
<form:form action="processForm" modelAttribute="test">
	
	Car Mark: <form:input path="carMark"/>
	<form:errors path="carMark" cssClass="error"/>
	<br><br>		
	<input type ="submit" value="Submit"/>
	</form:form>

</body>


</html>