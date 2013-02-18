package util;

import java.util.ArrayList;

public class User {
	private String nom;
	private String prenom;
	private String adrMail;
	private String motDePasse;
	private ArrayList<User> relations;
	
	private String poste;
	private String entreprise;
	private String adrEntreprise;
	private String cv;
	
	public User(){}
	
	public String getNom(){return this.nom;}
	public String getPrenom(){return this.prenom;}
	public String getAdrMail(){return this.adrMail;}
	public ArrayList<User> getRelations(){return this.relations;}
	public String getPoste(){return this.poste;}
	public String getentreprise(){return this.entreprise;}
	public String getadrEntreprise(){return this.adrEntreprise;}
	
	
	public void setNom(String nom){this.nom=nom;}
	public void setPrenom(String prenom){this.prenom=prenom;}
	public void setAdrMail(String adrMail){this.adrMail=adrMail;}
	public void setMotDePasse(String motDePasse){this.motDePasse=motDePasse;}
	public void setEntreprise(String entreprise){this.entreprise=entreprise;}
	public void setAdrEntreprise(String adrEntreprise){this.adrEntreprise=adrEntreprise;}
	
	public void addUser(){}
	public void supprUser(){}
	public void addRelation(){}
	public void supprRelation(){}
	//public ArrayList<User> suggRelations(){}
}
