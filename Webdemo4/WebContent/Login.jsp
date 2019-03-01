<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="Logincontroller" method="post">
<table align="center" border="1" >
<tr>
<td colspan="2" align="center">Sign in here</td>
</tr>
<tr bgcolor="lightpink">
<td>Login name</td>
<td><input type="text" name="lname" required/></td>
</tr>
<tr bgcolor="lightpink">
<td>Password</td>
<td><input type="Password" name="pname" required/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" name="button" value="Sign In"></td>
</tr>
</table>
</form>
</body>
</html>