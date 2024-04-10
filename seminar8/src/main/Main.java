package main;

import bilete.*;
import decoratoare_bilete.BiletLocal;
import decoratoare_bilete.Decorator;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet("A","B",25.f);
        imprimanta(bilet);

        Decorator bilet2 = new BiletLocal(bilet);
        bilet2.aplicaDiscountBilet();
    }

    public static void imprimanta(BiletAbstract bilet){
        bilet.printareBilet();
    }
}