<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel=stylesheet href="Head.css" type="text/css" />
<link rel=stylesheet href="bootstrap.css" type="text/css" />
<link rel=stylesheet href="Main.css" type="text/css" />
<link rel=stylesheet href="Creer_profil.css" type="text/css" />
<title>Créez votre profil! </title>
</head>
<body>
	<%@ include file = "../Cadre/Head.html" %>
	<div id="body_content">
		<form id="form_creer_profil" action="GestionProfil.jsp" method="GET">
			<div class="champs">  Votre nom : </div><input type="text" name="nom" id="nom" /></br>
			<div class="champs">Votre prénom: </div><input type="text" name="prenom" id="prenom" /></br>
			<div class="champs">Votre adresse : </div><input type="text" name="adresse" id="adresse" /></br>
			<div class="champs">Votre année de naissance : </div><input type="text" name="anneeNaiss" id="anneeNaiss" /></br>
			<div class="champs">Votre adresse mail : </div><input type="text" name="mail" id="mail" /></br> 
			<div class="champs">Choisissez un mot de passe :  </div><input type="text" name="mdp" id="mdp" /></br>
			<input name="submit" type="submit" value="bouiachaka"/>
		</form>
	</div>

</body>
</html>