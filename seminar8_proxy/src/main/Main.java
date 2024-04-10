package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet1 = new Bilet("A", "b",23.f);
        Client client = new Client("Popescu", 13);

        Client client2 = new Client("Pu", 18);
        bilet1.vanzareBilet(client);

        BiletAbstract bilet2 = new ProxyBilet(bilet1);
        bilet2.vanzareBilet(client);
        bilet2.vanzareBilet(client2);

        BiletAbstract bilet3 = new ProxySector(bilet1);
        ProxySector.adaugaLitere('P');
        bilet3.vanzareBilet(client);
        bilet3.vanzareBilet(client2);

    }
}