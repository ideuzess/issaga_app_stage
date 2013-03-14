package domaine;

public class DemandeConges {
	private String dateDebut;
	private String dateFin;
	private String dateDemande;
	private String etatValidation;
	public final static String ACCORDE = "valide";
	public final static String REFUS = "refus";
	public final static String ATTENTE = "en attente";

	public DemandeConges(String dateDebut, String dateFin, String dateDemande,
			String etatValidation) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dateDemande = dateDemande;
		this.etatValidation = etatValidation;
	}

	public DemandeConges(String dateDebut, String dateFin, String etatValidation) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatValidation = etatValidation;
	}

	public DemandeConges(String dateDebut, String dateFin) {
		this(dateDebut, dateFin, DemandeConges.ATTENTE);
	}
	
	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}
}
