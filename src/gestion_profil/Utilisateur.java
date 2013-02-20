package gestion_profil;

public class Utilisateur {
	
	/* attributs */
	private String nom;
	private String prenom;
	private String addr;
	/* chercher un type date en java */
	private String anneeNaissance;
	private String mail;
	private String mdp;
	
	/* constructeur */
	public Utilisateur(String nom, String prenom, String addr,
			String anneeNaissance, String mail, String mdp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.addr = addr;
		this.anneeNaissance = anneeNaissance;
		this.mail = mail;
		this.mdp = mdp;
	}
	
	public Utilisateur() {
	}

	/* get & set */
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAnneeNaissance() {
		return anneeNaissance;
	}
	public void setAnneeNaissance(String anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
}
