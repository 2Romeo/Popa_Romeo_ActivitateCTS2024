package composite.Spital.pb8.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament implements CompositeAbstract{
    String nume;

    public Departament(String nume) {
        this.nume = nume;
    }

    List<CompositeAbstract> sectii = new ArrayList<>();
    @Override
    public void adauga(CompositeAbstract abs) {
        sectii.add(abs);
    }

    @Override
    public void sterge(CompositeAbstract abs) {
        sectii.remove(abs);
    }

    @Override
    public CompositeAbstract getInstance(int i) {
        return sectii.get(i);
    }

    @Override
    public void GetDescriere() {
        System.out.println("departament " + nume);
        for(CompositeAbstract sectie:sectii){
            sectie.GetDescriere();
        }
        System.out.println("\n");
    }
}
