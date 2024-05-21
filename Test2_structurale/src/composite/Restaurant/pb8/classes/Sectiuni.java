package composite.Restaurant.pb8.classes;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Sectiuni implements CompositeAbstract {
    String nume;
    List<CompositeAbstract> items;

    public Sectiuni(String nume) {
        this.nume = nume;
        items = new ArrayList<>();
    }

    @Override
    public void adauga(CompositeAbstract abs) {
        items.add(abs);
    }

    @Override
    public void sterge(CompositeAbstract abs) {
        items.remove(abs);
    }

    @Override
    public CompositeAbstract getInstance(int i) {
        return items.get(i);
    }

    @Override
    public void getDescriere() {
        System.out.println("    " + nume);
        for (CompositeAbstract abs:items){
            System.out.print("    ");
            abs.getDescriere();
        }
    }
}
