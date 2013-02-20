package cv;

import java.io.File;

/**
 * Interface implémentée par les fichiers de génération de cv quel que soit le format.
 * @author Millambeur
 */
public interface GenerationCV {

	/**
	 * Crée un fichier au format spécifié par la classe CVFactory.
	 * @param cv
	 * @return
	 */
	public File genererCV(CV cv);
}
