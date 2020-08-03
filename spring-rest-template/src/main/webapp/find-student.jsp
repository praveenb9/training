<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getStudentById" method="get">
Enter Student Id     : <input type="number" name="studentId"><br>
<input type="submit" value="findById">
</form>
<form action="getStudentByName" method="get">
Enter Student Name     : <input type="text" name="studentName"><br>
<input type="submit" value="findByName">
</form>
</body>
</html>