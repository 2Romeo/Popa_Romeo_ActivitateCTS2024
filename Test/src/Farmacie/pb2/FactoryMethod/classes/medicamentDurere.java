package Farmacie.pb2.FactoryMethod.classes;

public class medicamentDurere extends medicament{
    public medicamentDurere(float pret, String denumire) {
        super(pret, denumire);
    }
    @Override
    public void showDetails() {
        System.out.println("medicament durere "+ this.denumire + " "+this.pret);
    }
}
