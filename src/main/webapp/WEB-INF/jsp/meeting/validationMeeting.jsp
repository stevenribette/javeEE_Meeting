<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page pageEncoding="UTF-8" isErrorPage="true" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meeting validé</title>
</head>
<body>
<div>Votre meeting a bien été enregistré le 
	 <fmt:formatDate type="date" dateStyle="long" value="${meeting.date}"/> à 
	 <fmt:formatDate type="time" value="${meeting.date}"/> 
	 pour <c:out value="${meeting.civilite}"/> <c:out value="${meeting.nom}"/> <c:out value="${meeting.prenom}"/>.
</div>
<div>
  	<a href="<c:url value="/"/>">Retour à l'accueil</a>  
</div>
</body>
</html>