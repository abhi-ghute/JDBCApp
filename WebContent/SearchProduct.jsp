<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<br><br>
<div align="center">
	<form action="searchProduct" method="GET">
	<table>
		<tr>
			<th>Product ID:</th>
			<td><input name="productID" required></td>	
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Search"></td>
		</tr>
	</table>
	</form>
</div>
</body>
</html>