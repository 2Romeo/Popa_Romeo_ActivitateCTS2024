package main;

import model.animal.Leu;
import model.animal.Maimuta;
import model.animal.Zebra;
import model.animal.Zookeeper;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Bucuresti", new Zookeeper("Ion"),null);
        Leu leu = new Leu("Leu1",4,4);
        Zebra zebra = new Zebra("zebra1",4,4);
        Maimuta maimuta = new Maimuta("maimuta1", 5, 4);

        zoo.adaugaAnimal(leu, "zebra");
        zoo.adaugaAnimal(zebra,"iarba");
        zoo.adaugaAnimal(maimuta,"banane");
        zoo.hranesteAnimalele();

        Zoo.Tip tip = Zoo.Tip.LEU;
    }
}