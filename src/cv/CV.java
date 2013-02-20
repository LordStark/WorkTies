package cv;

import java.util.ArrayList;

/**
 * Stocke les donn�es relatives au CV. Est utilis�e pour la g�n�ration de CV.
 * @author Millambeur
 */
public class CV {
	
	/* ----- Attributs d'instance ----- */
	private String titre;
	private ArrayList<Experience> etudes;
	private ArrayList<Experience> experiences;
	private ArrayList<Loisir> loisirs;
	private ArrayList<Connaissance> connaissancesParticulieres;
	
	
	/* ----- Constructeur ----- */
	/**
	 * Constructeur avec param�tres de la classe CV.
	 * @param titre
	 * @param etudes
	 * @param experiences
	 * @param loisirs
	 * @param connaissancesParticulieres
	 */
	public CV(String titre, ArrayList<Experience> etudes, ArrayList<Experience> experiences,
			ArrayList<Loisir> loisirs, ArrayList<Connaissance> connaissancesParticulieres) {
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
	public ArrayList<Experience> getEtudes() {
		return etudes;
	}
	public void setEtudes(ArrayList<Experience> etudes) {
		this.etudes = etudes;
	}
	public ArrayList<Experience> getExperiences() {
		return experiences;
	}
	public void setExperiences(ArrayList<Experience> experiences) {
		this.experiences = experiences;
	}
	public ArrayList<Loisir> getLoisirs() {
		return loisirs;
	}
	public void setLoisirs(ArrayList<Loisir> loisirs) {
		this.loisirs = loisirs;
	}
	public ArrayList<Connaissance> getConnaissancesParticulieres() {
		return connaissancesParticulieres;
	}
	public void setConnaissancesParticulieres(
			ArrayList<Connaissance> connaissancesParticulieres) {
		this.connaissancesParticulieres = connaissancesParticulieres;
	}

	/* ----- M�thodes d'instance ----- */
	/**
	 * Ajoute l'exp�rience dans la bonne liste en fonction de sa cat�gorie (professionnel ou scolaire).
	 * @param exp
	 */
	public void ajoutExperience(Experience exp){
		if(exp.getType() == 's'){
			etudes.add(exp);
		}
		if(exp.getType() == 'p'){
			etudes.add(exp);
		}
	}
	
	/**
	 * Supprime l'exp�rience dans la bonne liste en fonction de sa cat�gorie (professionnel ou scolaire).
	 * @param exp
	 */
	public void suppressionExperience(Experience exp){
		if(exp.getType() == 's'){
			etudes.remove(exp);
		}
		if(exp.getType() == 'p'){
			etudes.remove(exp);
		}
	}
	
	/**
	 * Ajoute un loisir dans la liste des loisirs.
	 * @param loisir
	 */
	public void ajoutLoisir(Loisir loisir){
		loisirs.add(loisir);
	}
	
	/**
	 * Supprime le loisir pass� en param�tre dans la liste des loisirs s'il existe.
	 * @param loisir
	 */
	public void suppressionLoisir(Loisir loisir){
		loisirs.remove(loisir);
	}
	
	/**
	 * Ajoute une connaissance dans la liste des connaissances.
	 * @param connaissance
	 */
	public void ajoutConnaissance(Connaissance connaissance){
		connaissancesParticulieres.add(connaissance);
	}
	
	/**
	 * Supprime la connaissance pass�e en param�tre dans la liste des connaissances si elle existe.
	 * @param loisir
	 */
	public void suppressionConnaissance(Connaissance connaissance){
		connaissancesParticulieres.remove(connaissance);
	}
}
