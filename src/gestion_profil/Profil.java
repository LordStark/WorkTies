package gestion_profil;

public class Profil{
	

	/*--attributs */
	private Utilisateur utilisateur;
	private String niveauEtude;
	private String poste;
	
	/* constructeur */
	public Profil(Utilisateur utilisateur, String niveauEtude, String poste) {
		super();
		this.utilisateur = utilisateur;
		this.niveauEtude = niveauEtude;
		this.poste = poste;
	}
	
	public Profil(){
		super();
		this.utilisateur = new Utilisateur();
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
