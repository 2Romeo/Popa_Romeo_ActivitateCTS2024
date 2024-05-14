package Farmacie.pb2.FactoryMethod.classes;

public abstract class medicament {
    protected float pret;
    protected String denumire;

    public medicament(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public abstract void showDetails();
}
