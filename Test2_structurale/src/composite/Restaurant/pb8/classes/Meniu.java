package composite.Restaurant.pb8.classes;

import java.util.ArrayList;
import java.util.List;

public class Meniu implements CompositeAbstract{
    List<CompositeAbstract> sectiuni;
    String nume;

    public Meniu(String nume) {
        this.nume = nume;
        sectiuni = new ArrayList<>();
    }

    @Override
    public void adauga(CompositeAbstract abs) {
        sectiuni.add(abs);
    }

    @Override
    public void sterge(CompositeAbstract abs) {
        sectiuni.remove(abs);
    }

    @Override
    public CompositeAbstract getInstance(int i) {
        return sectiuni.get(i);
    }

    @Override
    public void getDescriere() {
        System.out.println(nume + "sectiuni");
        for(CompositeAbstract compositeAbstract:sectiuni){
            compositeAbstract.getDescriere();
        }
    }
}
