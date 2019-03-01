<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration form</title>
</head>
<body>
<form action="Register" method="get">
<table>
<tr>
<td>username</td>
<td><input type="text" name="user" required/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="Password" name="Pass" required/></td>
</tr>
<tr>
<td>Customername</td>
<td><input type="text" name="cusname" required/></td>
</tr>
<tr>
<td>EmailID</td>
<td><input type="text" name="email" required/></td>
</tr>
<tr>
<td>Gender</td>
<td><input type="radio" name="gender" value="M"/>Male
<input type="radio" name="gender" value="F"/>Female
<input type="radio" name="gender" value="o"/>others
</td>
</tr>
<tr>
<td>Customer address</td>
<td><input type="textarea" col="20" row="5" name="addrr"></td>
</tr>
<tr>
<td colspan="2"  align="center"><input type="submit" name="sub" value="Register">
</td>
</tr>
</table>
</form>
</body>
</html>