package Farmacie.pb2.FactoryMethod.classes.factory;

import Farmacie.pb2.FactoryMethod.classes.medicament;
import Farmacie.pb2.FactoryMethod.classes.medicamentDurere;
import Farmacie.pb2.FactoryMethod.classes.medicamentRaceala;

public abstract class medicamentDurereFactory implements medicamentFactory {
    public medicament createMedicament(float float1, String denumire) {
        return new medicamentDurere(float1,denumire);
    }
}
