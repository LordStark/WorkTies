<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cr�ez votre profil! </title>
</head>
<body>
	<jsp:useBean id="profil" scope="session" class="gestion_profil.Profil"/>
	<%
		String nom = request.getParameter("nom");
		
		profil.getUtilisateur().setNom(nom);
		
	%>
	<jsp:forward page= "/AfficherProfil.jsp"/>
</body>
</html>