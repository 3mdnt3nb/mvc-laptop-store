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
<body>
		
		<form:form action="save" modelAttribute="laptop">
			<table>
			<tr>
				<td>
					 RandoM_access:
				</td>
				<td>
						<form:input path="RAM_GB" />
				</td>
			</tr> 
			
			<tr> 
				<td>
					Company_Manufactured:
				</td>
				<td>
					<form:input path="brand" />   
				</td>
			</tr>  
			
			<tr> 
				<td>
					Intel_process:
				</td>
				<td>
					<form:input path="processor" /> 
				</td>
			</tr>
			<tr>
			 	<td>
					Money:
				</td>
				<td>
					<form:input path="price" />
				</td>
			</tr>
			<tr> 
				<td>
					<form:button>Click to save here laptops</form:button> 
				</td>
			
			</tr>
			</table>	
		</form:form>
		

	

	<%-- <form:form action="save" modelAttribute="laptop">
		Company_Manufactured: <form:input path="brand"/><br><br>
		Randon_access: <form:input path="RAM_GB"/><br><br>
		Intel_process: <form:input path="processor"/><br><br>
		Money: <form:input path="price"/><br>
		<form:button>Click to save here laptops</form:button>
	
	</form:form> --%>
</body>
</html>