package main;

import clase.Categorie;
import clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta raceala = new Categorie("Raceala");
        StructuraAbstracta durere = new Categorie("Durere");
        StructuraAbstracta medicamente = new Categorie("Medicamente");

        StructuraAbstracta adulti = new Categorie("adulti");
        StructuraAbstracta copii = new Categorie("copii");

        StructuraAbstracta nurofen = new Categorie("nurofen");
        StructuraAbstracta paracetamol = new Categorie("paracetamol");
        StructuraAbstracta mig400 = new Categorie("mig400");
        StructuraAbstracta nurofenJunior = new Categorie("nurofenJunior");

        medicamente.adaugareCategorie(raceala);
        medicamente.adaugareCategorie(durere);

        raceala.adaugareCategorie(copii);
        raceala.adaugareCategorie(adulti);

        durere.adaugareCategorie(mig400);
        adulti.adaugareCategorie(nurofen);
        copii.adaugareCategorie(nurofenJunior);
        raceala.adaugareCategorie(paracetamol);

        medicamente.afisareProspect("   ");
        raceala.calculeazaPret(.22);
        medicamente.afisareProspect("   ");
    }
}