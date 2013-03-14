package domaine;

public class Manager extends Employe {

	public Manager(int id, String nom, String prenom) {
		super(id, nom, prenom);
	}

	public Manager(String nom, String prenom) {
		this(0, nom, prenom);
	}

	public Manager() {
		this(0, "DIALLO", "Issaga");
	}

	public Manager(String nom) {
		this(nom, "Issaga");
	}

	public void poserConge(String dateDebut, String dateFin) {
		super.poserConge(dateDebut, dateFin);
		System.out.println("Etant manager, il valide ses propres conges");
	}

	public void validerConge() {
		System.out.println("Manager  " + prenom + " " + nom
				+ " valide un conge");
	}

	public String toString() {
		return super.toString();
	}
}
