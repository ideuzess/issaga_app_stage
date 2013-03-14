package domaine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.*;

public class ServicePaie {

	public static Logger logger;

	public ServicePaie() {
		logger = Logger.getLogger(ServicePaie.class.getName());
	}

	public void listerCongePersonnel(IPersonnel personnel) {
		personnel.consulterConges();
	}

	public void exporterConges(IPersonnel personnel) {
		logger.info("Export des congés!");
		Iterator it = personnel.consulterConges().iterator();
		File file = new File("conges.txt");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file, true);
			while (it.hasNext()) {
				String conge = (String) it.next();
				fileWriter.write(conge + "\n");
			}
		} catch (IOException e) {
			logger.error("Erreur lors de l'écriture sur le fichier conges.txt !");
			System.err.println("erreur d'écriture fichier");
			e.printStackTrace();
		} finally {
			if (fileWriter != null){
				try {
					fileWriter.close();
					logger.info("Fermeture du fichier!");
				} catch (IOException e) {
					System.err.println("erreur de fermeture fichier");
					logger.error("Erreur lors de la fermeture du fichier !");
					e.printStackTrace();
				}
			}
		}
	}

}
