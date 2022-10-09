<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/><br>
<div align="center">

	<table style="text-align:center" border="1">
		<tr>
			<th>Product ID:</th>
			<td>${product.productID}</td>	
		</tr>
		<tr>
			<th>Product Name:</th>
			<td>${product.productName}</td>	
		</tr>
		<tr>
			<th>Product Weight:</th>
			<td>${product.weight}</td>	
		</tr>
		<tr>
			<th>Manufacturing Date:</th>
			<td>${product.mfgDate}</td>	
		</tr>
		<tr>
			<th>Expiry Date:</th>
			<td>${product.expDate}</td>	
		</tr>
		<tr>
			<th>color:</th>
			<td>${product.color}</td>	
		</tr>
		<tr>
			<th>Product Price:</th>
			<td>${product.price}</td>	
		</tr>
		<tr>
			<th>Discount:</th>
			<td>${product.discount}</td>	
		</tr>
		<tr>
			<th>Product category:</th>
			<td>${product.category}</td>	
		</tr>
	</table>

</div>
</body>
</html>