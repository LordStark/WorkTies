<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Créez votre profil! </title>
</head>
<body>
	<jsp:useBean id="profil" scope="session" class="gestion_profil.Profil"/>
	<%
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String annee = request.getParameter("anneeNaiss");
		String mail = request.getParameter("mail");
		String mdp = request.getParameter("mdp");
		
		profil.setAddr(adresse);
		profil.setNom(nom);
		profil.setPrenom(prenom);
		profil.setAnneeNaissance(annee);
		profil.setMail(mail);
		profil.setMdp(mdp);
	%>
	<jsp:forward page= "/AfficherProfil.jsp"/>
</body>
</html>