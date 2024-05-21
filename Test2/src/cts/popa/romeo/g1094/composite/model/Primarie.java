package cts.popa.romeo.g1094.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Primarie implements CompositeAbstract{
    List<CompositeAbstract> primariiSector;

    public Primarie() {
        primariiSector = new ArrayList<>();
    }

    @Override
    public void adauga(CompositeAbstract abs) {
        primariiSector.add(abs);
    }

    @Override
    public void sterge(CompositeAbstract abs) {
        primariiSector.remove(abs);
    }

    @Override
    public CompositeAbstract getInstanta(int i) {
        return primariiSector.get(i);
    }

    @Override
    public void getDescriere() {
        System.out.println("primarie + sectoare/obiective:");
        for(CompositeAbstract abs:primariiSector){
            System.out.print("      ");
            abs.getDescriere();
        }
    }

}
