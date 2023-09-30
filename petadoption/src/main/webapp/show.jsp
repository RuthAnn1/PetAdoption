<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach items="${requestScope.allPets}" var = "vurrentpet">
	<tr>
		<td>${currentpet.petType }</td>
		<td>${currentpet.petBreed }</td>
		<td>${currentpet.petAge}</td>
	
	</tr>

</c:forEach>
</table>
</body>
</html>