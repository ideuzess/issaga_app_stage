package lanceur;

import domaine.Employe;
import domaine.Manager;
import domaine.ServicePaie;

public class LanceurGestionConges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServicePaie paie = new ServicePaie();
		Employe e1 = new Employe(1, "DIALLO", "issaga");
		Employe e2 = new Employe(2, "BA", "deuzess");
		Manager m = new Manager(3, "ZESS", "deuz");
		e1.poserConge("09/08/2013", "09/09/2013");
		m.validerConge();
		e2.poserConge("19/02/2013", "28/02/2013");
		m.validerConge();
		m.poserConge("12/03/2013", "23/12/2013");
		m.validerConge();
		paie.exporterConges(e1);
		paie.exporterConges(e2);
	}

}