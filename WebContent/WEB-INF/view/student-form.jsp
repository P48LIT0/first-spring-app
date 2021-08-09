<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>

Student Registration form
<br><br>
<form:form action="processForm" modelAttribute="student">

First name: <form:input path="firstName" />
<br><br>
Last name: <form:input path="lastName" />
<br><br>
Country: <form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br><br>
Favorite programming language:
<form:radiobuttons path="language" items="${student.programmingLanguageOptions}"></form:radiobuttons>
	<br><br>
System you use:
Linux <form:checkbox path="operatingSystem" value="Linux"></form:checkbox>
Mac OS <form:checkbox path="operatingSystem" value="Mac OS"></form:checkbox>
Windows <form:checkbox path="operatingSystem" value="Windows"></form:checkbox>
		<br><br>
<input type="submit" value="Przeslij"/>
</form:form>
</body>

</html>