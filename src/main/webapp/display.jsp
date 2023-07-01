<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<table border="5px" >
			<tr>
				<th>ID</th>
				<th>BRAND</th>
				<th>RAM</th>
				<th>Processor</th>
				<th>Price</th>
				<td>DELETE HERE</td>
				<td>UPDATE HERE</td>
				
			</tr>
			<c:forEach items="${rcb}" var="l">
			<tr>
				<td> ${l.getId() }</td>
				<td>${l.getBrand() }</td>
				<td>${l.getRAM_GB() }</td>
				<td>${l.getProcessor() }</td>
				<td>${l.getPrice() }</td>
				
				<td><a href="delete?id=${l.getId()}"> delete button</a></td>
				<td><a href="update?id=${l.getId()}"> update button</a></td>
				
				
			</tr>
			</c:forEach>
			
		</table>
		<h1>${msg}</h1>

</body>
</html>