<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>añadir nuevo cliente</h2>
<form method="post" action="add">
<p>id : <input type="number" name="id"></p>
<p>nombre : <input type="text" name="nombre"></p>
<p>ciudad : <input type="text" name="ciudad"></p>
<p>facturacion : <input type="number" name="facturacion" step="0.01"></p>
<input type="submit" value="Grabar cliente">



</form>
</body>
</html>