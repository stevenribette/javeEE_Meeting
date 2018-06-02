<%@page pageEncoding="UTF-8" isErrorPage="true" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File d'attente</title>
</head>
<body>
<form method="post" accept-charset="utf-8">
	<c:out value="${meeting.nom}"/>
</form>
<div>
  	<a href="<c:url value="/"/>">Retour à l'accueil</a>  
</div>
</body>
</html>