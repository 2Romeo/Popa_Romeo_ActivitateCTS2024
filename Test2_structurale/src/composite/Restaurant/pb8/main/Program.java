package composite.Restaurant.pb8.main;

import composite.Restaurant.pb8.classes.CompositeAbstract;
import composite.Restaurant.pb8.classes.Meniu;
import composite.Restaurant.pb8.classes.Sectiuni;

public class Program {
    public static void main(String[] args) {
        CompositeAbstract c1 = new Meniu("m1");
        CompositeAbstract s1 = new Sectiuni("s1");
        CompositeAbstract s2 = new Sectiuni("s2");
        CompositeAbstract s3 = new Sectiuni("s3");
        CompositeAbstract s4 = new Sectiuni("s4");
        CompositeAbstract s5 = new Sectiuni("s5");
        c1.adauga(s1);
        c1.adauga(s2);
        s2.adauga(s3);
        s2.adauga(s4);
        s4.adauga(s5);

        c1.getDescriere();
    }
}
