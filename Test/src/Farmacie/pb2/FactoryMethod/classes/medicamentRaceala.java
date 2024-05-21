package Farmacie.pb2.FactoryMethod.classes;

public class medicamentRaceala extends medicament {

    public medicamentRaceala(float pret, String denumire) {
        super(pret, denumire);
    }
    @Override
    public void showDetails() {
        System.out.println("medicament raceala "+ this.denumire + " "+this.pret);
    }
}
