<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Insert title here</title>
</head>
<body>
	<h3>Identificacion usuario administrador:</h3>

	<form:form method="post" action="userAdmin.htm">
		<table>
			<tr>
				<td>Nombre usuario:</td>
				<td><input type="text" name="usuario"></td>
			</tr>
			<tr>
				<td>Clave:</td>
				<td><input type="text" name="clave"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Acceder"></td>
			</tr>
		</table>
		
	</form:form>
</body>
</html>