package gestion_profil;

public class Profil extends Utilisateur {
	

	/*--attributs */
	private String niveauEtude;
	private String poste;
	
	/* constructeur */
	public Profil(String nom, String prenom, String addr,
			String anneeNaissance, String mail, String mdp, String niveau, String poste) {
		super(nom, prenom, addr, anneeNaissance, mail, mdp);
		this.niveauEtude = niveau;
		this.poste = poste;
	}
	
	public Profil(){
		super();
	}
	
	/* get & set */
	public String getNiveauEtude() {
		return niveauEtude;
	}
	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}

}
