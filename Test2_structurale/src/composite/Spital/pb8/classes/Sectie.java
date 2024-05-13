package composite.Spital.pb8.classes;

public class Sectie implements CompositeAbstract{
    String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adauga(CompositeAbstract abs) {

    }

    @Override
    public void sterge(CompositeAbstract abs) {

    }

    @Override
    public CompositeAbstract getInstance(int i) {
        return null;
    }

    @Override
    public void GetDescriere() {
        System.out.println("    sectie " + nume );
    }
}
