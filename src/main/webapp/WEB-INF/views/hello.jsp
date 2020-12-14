<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Pagina inicial</title>
</head>
<body>
<h1>Filmografia</h1>
<br>
<a href="<c:url value="informacionGeneral.htm"/>"><input type="submit" name="Opcion" value="Info"></a><br><br>
<a href="<c:url value="consultarDirectores.htm"/>"><input type="submit" name="Opcion" value="Consultar directores"></a><br><br>
<a href="<c:url value="login.htm"/>"><input type="submit" name="Opcion" value="Login"></a><br><br>
</body>
</html>