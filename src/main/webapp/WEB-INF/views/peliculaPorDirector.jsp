<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head><title><fmt:message key="title"/></title></head>
<body>
	<table>
		<tbody>
			<tr>
				<th>Director</th>
				<th>Titulo</th>
				<th>Fecha</th>
			</tr>
			<c:forEach items="${model.director}" var="pelicula" >
				<tr>
					<td><c:out value="${pelicula.id}" /></td>
					<td><c:out value="${pelicula.director}" /></td>
					<td><c:out value="${pelicula.titulo}"></c:out></td>
					<td><c:out value="${pelicula.fecha}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<p>Desea realizar otra consulta?</p>
	<a href="consultarDirectores.jsp"><input type="submit"
			name="Opcion" value="Si" /></a>
			<br>
	<form action="ServletDirectoresConsultados" method="post">
		 <a href="directoresConsultados.jsp"><input
			type="submit" name="Opcion" value="Finalizar" /></a>
	</form>
</body>
</html>