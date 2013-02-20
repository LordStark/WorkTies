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
	<%@ include file = "Head.html" %>
	<jsp:useBean id="profil" scope="session" class="gestion_profil.Profil"/>
			<%=profil.getUtilisateur().getNom()%>
</body>
</html>