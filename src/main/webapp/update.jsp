<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
#na {
	margin: auto;
}
</style>

<body>
	<h1>UPDATE HERE</h1>

	<form:form action="updated" modelAttribute="msg">

		<table id="na">
			<tr>
				<td>BRAND:</td>
				<td><form:input path="brand" /></td>
			</tr>

			<tr>
				<td>RAM:</td>
				<td><form:input path="RAM_GB" /></td>
			</tr>

			<tr>
				<td>PROCESSOR:</td>
				<td><form:input path="processor" /></td>
			</tr>

			<tr>
				<td>MONEY:</td>
				<td><form:input path="price" /></td>
			</tr>

			<tr>
				<td>ID:</td>
				<td><form:input path="id" /></td>
			</tr>

			<tr>
				<td><form:button>Click Update</form:button></td>
			</tr>

		</table>

	</form:form>

</body>
</html>