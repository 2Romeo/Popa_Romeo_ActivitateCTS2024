package Farmacie.pb2.FactoryMethod.classes.factory;

import Farmacie.pb2.FactoryMethod.classes.medicament;
import Farmacie.pb2.FactoryMethod.classes.medicamenteBody;

public class medicamentBodyFactory implements medicamentFactory{
    public medicament createMedicament(float float1, String denumire) {
        return new medicamenteBody(float1,denumire);
    }
}
