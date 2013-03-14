package domaine;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.ResourceBundle;

public class Employe implements IPersonnel {
	protected int id;
	protected String nom;
	protected String prenom;
	protected Collection<String> listeConges;

	public Employe(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Employe(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Employe() {

	}

	public Employe(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/*
	 * On ne prend pas le temps de laisser le manager valider le congé !!!
	 */
	public void poserConge(String dateDebut, String dateFin) {
		Locale locale = Locale.getDefault();
//		Locale locale = new Locale ("en", "US");
//		Locale locale = new Locale ("fr", "FR");
		ResourceBundle messages = ResourceBundle
				.getBundle("monfichier", locale);
		String titre = messages.getString("civility");
		String msg1 = messages.getString("msg1");
		String msg2 = messages.getString("msg2");
		String chaine = titre + " " + prenom + " " + nom + " " + msg1 + " "
				+ dateDebut + " "+ msg2+" " + dateFin;
		System.out.println(chaine);
		if (listeConges == null)
			this.listeConges = new LinkedList<>();
		this.listeConges.add(chaine);
	}

	public String toString() {
		return "Employe :" + this.id + ", " + this.prenom + ", "
				+ this.nom.toUpperCase();
	}

	@Override
	public Collection<String> consulterConges() {
		System.out.println("Consultation des congés de " + prenom + " " + nom);
		return this.listeConges;
	}
}