package program;

import observer.Client;
import observer.Turist;
import restaurant.Restaurant;
import restaurant.SalaDeSport;
import restaurant.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect restaurant = new Restaurant("calea dorobanti nr.22");
        Subiect sala = new SalaDeSport();
        Client client1 = new Client("Ion");
        Client client2 = new Client("Gigel");
        Turist turist = new Turist("abasd");
        restaurant.adaugaClient(client1);
        restaurant.adaugaClient(client2);
        restaurant.adaugaClient(turist);
        restaurant.notificareMeniuNou();
        restaurant.stergeClient(client1);

        sala.adaugaClient(client1);
        sala.adaugaClient(turist);
        ((SalaDeSport)sala).notificareMeciVolley(); // sau nu folosim dependecy inversion si facem SalaDeSport sala = new SalaDeSport()
        restaurant.notificareSchimbareMeniu();
    }
}