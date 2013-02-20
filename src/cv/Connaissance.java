package cv;

/**
 * Classe qui stocke les connaissances particuli�res de l'utilisateur.
 * @author Millambeur
 */
public class Connaissance {

	/* ----- Attributs d'instance ----- */
	/* chaque comp�tence pr�sente dans texte a un niveau estim� par l'utilisateur sur 10 dans le tableau niveau. */
	private String categorie;
	private String[] texte;
	private int[] niveau;
	
	/* ----- Constructeurs ----- */
	/**
	 * Constructeur sans param�tres.
	 */
	public Connaissance() {
		super();
	}

	/**
	 * Constructeur avec param�tres.
	 * @param categorie
	 * @param texte
	 * @param niveau
	 */
	public Connaissance(String categorie, String[] texte, int[] niveau) {
		super();
		this.categorie = categorie;
		this.texte = texte;
		this.niveau = niveau;
	}

	/* ----- Getters et Setters ----- */
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String[] getTexte() {
		return texte;
	}

	public void setTexte(String[] texte) {
		this.texte = texte;
	}

	public int[] getNiveau() {
		return niveau;
	}

	public void setNiveau(int[] niveau) {
		this.niveau = niveau;
	}

}
