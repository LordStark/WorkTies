<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel=stylesheet href="Head.css" type="text/css" />
<link rel=stylesheet href="boostrap.css" type="text/css" />
<title>Cr�ez votre cv !</title>
</head>
<body>
	<form action="GestionProfil.jsp" method="GET">
		Intitul� de ce que vous cherchez : <input type="text" name="titre" id="titre" /></br>
		<div id="etudes" name="etudes">
			<input type="text" name="prenom" id="prenom" /></br>
		</div>
		Votre adresse : <input type="text" name="adresse" id="adresse" /></br>
		Votre ann�e de naissance : <input type="text" name="anneeNaiss" id="anneeNaiss" /></br>
		Votre adresse mail : <input type="text" name="mail" id="mail" /></br> 
		Choisissez un mot de passe :  <input type="text" name="mdp" id="mdp" /></br>
		<input name="submit" type="submit" value="bouiachaka"/>
	</form>
	

</body>
</html>