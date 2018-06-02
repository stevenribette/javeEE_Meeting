<%@page pageEncoding="UTF-8" isErrorPage="true" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prendre rendez-vous</title>
</head>
<body>
<form method="post" accept-charset="utf-8">
	<p><label>Civlité : </label><select>
	  <option value="madame">Madame</option>
	  <option value="monsieur">Monsieur</option>
	</select>
	<span class="error"><c:out value="${errors['civilite']}"/></span>
	</p>
	
	<p><label>Nom : </label><input name="nom"></p>
	<span class="error"><c:out value="${errors['nom']}"/></span>
	<p><label>Prénom : </label><input name="prenom"></p>
	<span class="error"><c:out value="${errors['prenom']}"/></span>
	<p><label>Urgent : </label><input type="checkbox" name="urgent"></p>
	<button type="submit">Envoyer</button>
</form>
<div>
  	<a href="<c:url value="/"/>">Retour à l'accueil</a>  
</div>
</body>
</html>