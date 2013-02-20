package cv;

import java.util.Date;

/**
 * Classe m�tier qui stockera les exp�riences pro et les ann�es d'�tude.
 * @author Millambeur
 */
public class Experience {

	/* ----- Attributs ----- */
	private String titre;
	private Date dateDebut;
	private Date dateFin;
	/* le type est soit p = professionnel, soit s = scolaire */
	private char type;
	private String etablissement;
	private String texte;
	
	/* ----- Constructeurs ----- */
	/**
	 * Constructeur sans param�tres.
	 */
	public Experience() {
		super();
	}
	
	/**
	 * Constructeur avec param�tres.
	 * @param titre
	 * @param dateDebut
	 * @param dateFin
	 * @param type
	 * @param etablissement
	 * @param texte
	 */
	public Experience(String titre, Date dateDebut, Date dateFin, char type,
			String etablissement, String texte) {
		super();
		this.titre = titre;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.type = type;
		this.etablissement = etablissement;
		this.texte = texte;
	}

	/* ----- Getters et Setters ----- */
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}
}
