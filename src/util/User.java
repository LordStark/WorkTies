<<<<<<< HEAD
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
=======
package util;

import util.cv.CV;

public class User {
	
	/*----attributs-------*/
	private String nom;
	private String prenom;
	private String adrMail;
	private String motDePasse;
	private String poste;
	private CV cv;
	
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
	public CV getCv() {
		return cv;
	}
	public void setCv(CV cv) {
		this.cv = cv;
	}

}
>>>>>>> 72b8ae5cf0b88de04c04cdd76e2393aa26e49d81
