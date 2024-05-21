package Farmacie.pb2.FactoryMethod.classes.factory;

import Farmacie.pb2.FactoryMethod.classes.medicament;
import Farmacie.pb2.FactoryMethod.classes.medicamentRaceala;

public class medicamentRacealaFactory implements medicamentFactory {

    @Override
    public medicament createMedicament(float float1, String denumire) {
        return new medicamentRaceala(float1,denumire);
    }
}
