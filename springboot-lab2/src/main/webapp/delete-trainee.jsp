<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Delete Operation</h1>
<form action="/find" method="post">
<table class="col-mid-4" border="1">

<tr>
<td>
Please enter trainee ID
</td>
<td>
<input type="number" name="traineeId" >
</td>
<td>
<button type="submit">search</button>
</td>
</tr>


</table>
</form>
<br>
<!--  <form action="/deletetrainee?traineeId=${trainee.traineeId }" method="get">-->
<h1>Trainee Info</h1>
<br>
<table class="col-mid-4" border="1">
<tr>
<th>Trainee ID</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<tr>
<td>${trainee.traineeId}</td>
<td>${trainee.traineeName}</td>
<td>${trainee.traineeLocation}</td>
<td>${trainee.traineeDomain}</td>
</tr>
<tr>
<td></td>
<td></td>
<td>
<td><a href="/deletetrainee?traineeId=${trainee.traineeId }">Delete</a>
</td>
</tr>
</table>


</body>
</html>