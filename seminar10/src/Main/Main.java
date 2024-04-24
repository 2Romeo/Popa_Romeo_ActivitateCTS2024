package Main;

import Clase.Cash;
import Clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client1= new Client("Ion");
        client1.realizeazaPlata(24);
        client1.setModPlata(new Cash());
        client1.realizeazaPlata(24);
    }
}