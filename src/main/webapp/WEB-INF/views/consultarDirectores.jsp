<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Consultar directores</title>
</head>
<body>
	<h3>Introduce el nombre del director:</h3>
	<form:form method="post" action="peliculaPorDirector.htm"> 
		<table>
			<tr>
				<td>Nombre del director:</td>
				<td><input type="text" name="director"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Consultar"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>