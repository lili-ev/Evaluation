
public abstract class Vehicule {
	protected String immatriculation;
	protected String marque;
	protected double tarifJournalier;
	
	
	public Vehicule(String immatriculation, String marque, double tarifJournalier) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.tarifJournalier = tarifJournalier;
	}
	public double getTarifJournalier() {
		return tarifJournalier;
	}
	public abstract double calculerCout(int nbJours);
	
	public void afficherDetails() {
		System.out.println("immatriculation : " + immatriculation);
		System.out.println("marque : " + marque);
		System.out.println("tarifJournalier : " + tarifJournalier);
	}

	
	
}

