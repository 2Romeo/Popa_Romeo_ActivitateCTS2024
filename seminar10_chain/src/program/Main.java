package program;

import clase.Cash;
import clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client1= new Client("Ion");
        client1.realizeazaPlata(24);
        client1.realizeazaPlata(20);
        client1.realizeazaPlata(90);
    }
}