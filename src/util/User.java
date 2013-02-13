package util;

public class User {
	private String nom;
	private String prenom;
	private String adrMail;
	private String motDePasse;
	
	
	private String poste;
	private String cv;
	
	public User(){}
	
	public String getNom(){return this.nom;}
	public String getPrenom(){return this.prenom;}
	public String getAdrMail(){return this.adrMail;}
	public String getPoste(){return this.poste;}
	
	public void setNom(String nom){this.nom=nom;}
	public void setPrenom(String prenom){this.prenom=prenom;}
	public void setAdrMail(String adrMail){this.adrMail=adrMail;}
	public void setPoste(String poste){this.poste=poste;}
	
	public void addUser(){}
	public void supprUser(){}
}
