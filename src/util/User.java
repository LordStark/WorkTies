package util;

public class User {
	
	/*----attributs-------*/
	private String nom;
	private String prenom;
	private String adrMail;
	private String motDePasse;
	private String poste;
	private String cv;
	
	/*---get & set---*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getAdrMail() {
		return adrMail;
	}
	public void setAdrMail(String adrMail) {
		this.adrMail = adrMail;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}

}
