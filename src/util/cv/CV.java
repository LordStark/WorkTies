package util.cv;

/**
 * Stocke les données relatives au CV. Est utilisée pour la génération de CV.
 * @author Millambeur
 */
public class CV {
	
	/* ----- Attributs d'instance ----- */
	private String titre;
	private String[] etudes;
	private String[] experiences;
	private String[] loisirs;
	private String[] connaissancesParticulieres;
	
	
	/* ----- Constructeur ----- */
	/**
	 * Constructeur avec paramètres de la classe CV.
	 * @param titre
	 * @param etudes
	 * @param experiences
	 * @param loisirs
	 * @param connaissancesParticulieres
	 */
	public CV(String titre, String[] etudes, String[] experiences,
			String[] loisirs, String[] connaissancesParticulieres) {
		super();
		this.titre = titre;
		this.etudes = etudes;
		this.experiences = experiences;
		this.loisirs = loisirs;
		this.connaissancesParticulieres = connaissancesParticulieres;
	}
	
	/* ----- Getters et Setters ----- */
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String[] getEtudes() {
		return etudes;
	}
	public void setEtudes(String[] etudes) {
		this.etudes = etudes;
	}
	public String[] getExperiences() {
		return experiences;
	}
	public void setExperiences(String[] experiences) {
		this.experiences = experiences;
	}
	public String[] getLoisirs() {
		return loisirs;
	}
	public void setLoisirs(String[] loisirs) {
		this.loisirs = loisirs;
	}
	public String[] getConnaissancesParticulieres() {
		return connaissancesParticulieres;
	}
	public void setConnaissancesParticulieres(
			String[] connaissancesParticulieres) {
		this.connaissancesParticulieres = connaissancesParticulieres;
	}

}
