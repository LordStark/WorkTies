package cv;

/**
 * Classe qui stocke des loisirs pour le CV.
 * @author Millambeur
 */
public class Loisir {

	/* ----- Attributs d'instance ----- */
	private String titre;
	private String texte;
	
	/* ----- Constructeurs ----- */
	/**
	 * Constructeur sans paramètres.
	 */
	public Loisir() {
		super();
	}
	
	/**
	 * Constructeur avec paramètres.
	 * @param titre
	 * @param texte
	 */
	public Loisir(String titre, String texte) {
		super();
		this.titre = titre;
		this.texte = texte;
	}

	/* ----- Getters et Setters ----- */
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

}
