package util.cv;

import java.io.File;

/**
 * La factory est utile si l'on souhaite pouvoir g�n�rer le cv sous diff�rents formats.
 * @author Millambeur
 */
public class CVFactory {

	/**
	 * Constructeur de la classe CVFactory.
	 */
	public CVFactory() {
		super();
	}
	
	/**
	 * Retourne le CV correspondant selon le format souhait�.
	 * @param formatFichier
	 * @param cv
	 * @return
	 */
	public static File getCV(String formatFichier, CV cv){
		if(formatFichier.equals("pdf")){
			return new GenerationPDF().genererCV(cv);
		}
		return null;
	}

}
