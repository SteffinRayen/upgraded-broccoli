<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<script type="text/javascript">
	function OpenPage(pageUrl) {
		window.location.href = pageUrl;
	}

</script>
<link rel="stylesheet" href="css/main.css">

</head>
<body>
	<table>
		<tr>
			<td>Click to logout</td>
			<td><input type="button" value="Logout" OnClick="OpenPage('index.jsp')"></td>
			
		</tr>
		<tr>
			<td>Click to search</td>
			<td><input type="button" value="Search" OnClick="OpenPage('search.jsp')"></td>
		</tr>
	</table>
</body>
</html>