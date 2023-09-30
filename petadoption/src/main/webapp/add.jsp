<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add new pet!</h1>
	<form action = "addPet" method = "post">
		Pet Type:<input
			type = "text" name = "petType" size = "25"/>
			Pet Breed:<input
			type = "text" name = "petBreed" size = "25"/>
			Pet Type:<input
			type = "text" name = "petAge" size = "25"/>
			<input type="submit" value="Add Pet!" />
	</form>
</body>
</html>