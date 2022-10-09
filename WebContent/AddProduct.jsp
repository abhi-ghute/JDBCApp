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
	<form action="addProduct" method="GET">
	<table style="text-align:center" border="1">
		<tr>
			<th>Product ID:</th>
			<td><input name="productID" required></td>	
		</tr>
		<tr>
			<th>Product Name:</th>
			<td><input name="prooductName" required></td>	
		</tr>
		<tr>
			<th>Product Weight:</th>
			<td><input name="weight" required></td>	
		</tr>
		<tr>
			<th>Manufacturing Date:</th>
			<td><input name="mfgDate" type="date" required></td>	
		</tr>
		<tr>
			<th>Expiry Date:</th>
			<td><input name="expDate" type="date" required></td>	
		</tr>
		<tr>
			<th>color:</th>
			<td><input name="color" required></td>	
		</tr>
		<tr>
			<th>Product Price:</th>
			<td><input name="price" required></td>	
		</tr>
		<tr>
			<th>Discount:</th>
			<td><input name="discount" required></td>	
		</tr>
		<tr>
			<th>Product category:</th>
			<td><input name="category" required></td>	
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="AddProduct"></td>
		</tr>
	</table>
	</form>
</div>
</body>
</html>