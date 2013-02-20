package cv;

import java.io.File;

/**
 * Interface impl�ment�e par les fichiers de g�n�ration de cv quel que soit le format.
 * @author Millambeur
 */
public interface GenerationCV {

	/**
	 * Cr�e un fichier au format sp�cifi� par la classe CVFactory.
	 * @param cv
	 * @return
	 */
	public File genererCV(CV cv);
}
