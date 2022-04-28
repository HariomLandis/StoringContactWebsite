<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<style>
  .center{
      margin-left:auto;
      margin-right:auto;
  }
</style>
</head>
<body>
<form action="register" method="post" align="center">
<h2><strong>Online Book Store</strong></h2>
<table class="center" width="60" border="2" >
<tr>
   <th>User Id</th>
   <td><input type="number" name="uid" id="uid1" required="required" maxLen="1000000000" minLen="9999999999" placeholder="enter the id"/><br/></td>
<tr/>
<tr>
   <th>Name</th>
   <td><input type="text" name="uname" id="uname1" required placeholder="enter your name"/><br/></td>
</tr>
<tr>
   <th>Password</th>
   <td><input type="password" name="upass" id="upass1" required="required" placeholder="enter the password" minLength="4" maxLength="9"/><br/></td>
<tr/>
<tr>
   
<th>Role</th>
<td>
  <select name="role">
  <option value="Customer">Customer</option>
  <option value="Admin">Admin</option>
  </select>
  </td>
   </tr>
   <tr>
     <th><button type="submit" value="submit" name="btn"/>SUBMIT</th>
     <td><button type="reset" value="reset" />RESET</td>
     </tr>

</table>	
</form>
<h4><a href="index.jsp"><center>Go Back</center></a></h4>
</body>
</html>