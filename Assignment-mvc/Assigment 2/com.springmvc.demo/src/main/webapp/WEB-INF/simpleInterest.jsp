 <%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/com.springmvc.demo/process" method="post">
  <label for="fname">Principal:</label><br>
  <input type="text" id="fname" name="pricipal"><br>
  <label for="lname">Rate:</label><br>
  <input type="text" id="lname" name="rate"><br><br>
  <label for="lname">Time:</label><br>
  <input type="text" id="lname" name="time"><br><br>
  <input type="submit" value="Submit">
</form> 

</body>
</html>