package cts.popa.romeo.g1094.composite.model;

public class ObiectivTuristic implements CompositeAbstract{
    String nume;

    public ObiectivTuristic(String nume) {
        this.nume = nume;
    }

    @Override
    public void adauga(CompositeAbstract abs) {

    }

    @Override
    public void sterge(CompositeAbstract abs) {

    }

    @Override
    public CompositeAbstract getInstanta(int i) {
        return null;
    }

    @Override
    public void getDescriere() {
        System.out.println("        obiectiv turistic " + nume);
    }
}
