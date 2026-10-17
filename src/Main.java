
public class Main {

    public static void main(String[] args) {

       
        Client c1 = new Client(1, "Amine", "Ali");
        Client c2 = new Client(2, "Sara", "Amrani");

    
        Voiture v1 = new Voiture("A123", "Dacia", 300, 5);
        Voiture v2 = new Voiture("B456", "Renault", 400, 7);
        Moto m1 = new Moto("C789", "Yamaha", 150, 125);

    
        Vehicule[] vehicules = {v1, v2, m1};


        System.out.println("=== LISTE DES VEHICULES ===");

        for (Vehicule v : vehicules) {
            v.afficherDetails();
            System.out.println("--------------------");
        }

       
        Location l1 = new Location(c1, v1, 3);
        Location l2 = new Location(c2, v2, 2);
        Location l3 = new Location(c1, m1, 6);

        
        Location[] locations = {l1, l2, l3};

    
        double total = 0;

        System.out.println("=== LISTE DES LOCATIONS ===");

        for (Location l : locations) {
            l.afficherRecapitulatif();
            total = total + l.calculerMontant();
            System.out.println("--------------------");
        }

        System.out.println("Montant total : " + total + " DH");
    }
}
