package clase;

public class Medicament implements StructuraAbstracta{
    private String nume;
    private Double pret;
    @Override
    public void adaugareCategorie(StructuraAbstracta structaAbs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereCategorie(StructuraAbstracta structaAbs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println(indentare + " Medicamentul cu numele " + this.nume + " are pretul " + this.pret);
    }

    @Override
    public void calculeazaPret(Double procent) {
        this.pret -= pret*procent;
    }
}
