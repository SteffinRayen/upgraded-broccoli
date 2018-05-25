<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script type="text/javascript">
	function OpenPage(pageUrl) {
		window.location.href = pageUrl;
	}

</script>
<link rel="stylesheet" href="css/main.css">

</head>
<body>
	<form action="RegisterServlet" method="post">
	<table >
		<tr>
			<td><label >First Name</label></td>
			<td><input type="text" name="fname" ></td>
		</tr>
		<tr>
			<td><label >Last Name</label></td>
			<td><input type="text" name="lname" ></td>
		</tr>
		<tr>
			<td><label >Email ID</label></td>
			<td><input type="text" name="email" ></td>
		</tr>
		<tr>
			<td><label >User Name</label></td>
			<td><input type="text" name="uname" ></td>
		</tr>
		<tr>
			<td><label >Password</label></td>
			<td><input type="password"  name="pass" ></td>
		</tr>
		<tr>
			<td colspan="2"><button type="submit" >Register</button></td>
		</tr>
	</table>    
	
	    	
	</form>
	
</body>
</html>