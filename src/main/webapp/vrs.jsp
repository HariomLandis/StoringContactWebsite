<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.io.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action='vrs' method='get' >
<table width='20%' border='2'>
<tr><th>ID</th>
<td><input type='number' placeholder='enter your id' name='vid' required='required' maxLength='9999999999' minLength='1000000000'/>
</td></tr>
<tr><th>PASSWORD</th><td><input type='text' placeholder='enter your password' name='ps' required='required' />
</td></tr>
<tr><th><input type='submit' value='submit'/></th></tr>
</table>
</form>
</center>
</body>
</html>