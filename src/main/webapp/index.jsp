<%@page pageEncoding="UTF-8" isErrorPage="true" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
  	<meta charset="UTF-8">
    <title>Java EE</title>
  </head>
  <body>
  	<a href="<c:url value="/meeting"/>">Prendre rendez-vous</a>
	<a href="<c:url value="/file"/>">Consulter la file</a>
  </body>
</html>