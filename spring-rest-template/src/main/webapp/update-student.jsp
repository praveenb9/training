<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/updateStudent" method="post">
Student Id     : <input type="number" name="studentId"><br>
Student Name   : <input type="text" name="studentName"><br>
Student D.O.B  : <input type="date" name="dob"><br>
<input type="submit" value="update">
</form>
</body>
</html>