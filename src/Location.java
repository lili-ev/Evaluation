
public class Location {
	private Client client;
	private Vehicule vehicule;
	private int nbJours;
	
	
	public Location(Client client, Vehicule vehicule, int nbJours) {
	    this.client = client;
	    this.vehicule = vehicule;
	    this.nbJours = nbJours;
	}
	public double calculerMontant() {
		return vehicule.calculerCout(nbJours);
		
	}
	
	public void afficherRecapitulatif() {
		System.out.println("Client : " + client);
		System.out.println("Marque : " + vehicule.marque);
		System.out.println("Immatriculation : " + vehicule.immatriculation);
		System.out.println("Immatriculation : " + vehicule.immatriculation);
		System.out.println("Duree : " + nbJours);
		System.out.println("Montant total : " + calculerMontant() + "DH");
		
	}
	
	

}
