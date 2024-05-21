package Farmacie.pb2.FactoryMethod.classes;

public class medicamenteBody extends medicament{
    public medicamenteBody(float pret, String denumire) {
        super(pret, denumire);
    }
    @Override
    public void showDetails() {
        System.out.println("medicament body "+ this.denumire + " "+this.pret);
    }
}
