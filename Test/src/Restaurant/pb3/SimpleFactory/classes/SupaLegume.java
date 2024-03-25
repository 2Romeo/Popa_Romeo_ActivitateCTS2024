package Restaurant.pb3.SimpleFactory.classes;

public class SupaLegume extends Supa {

    public SupaLegume(String nume) {
        super(nume);
    }

    public void getInformatii() { System.out.println("supa legume " + this.nume);
    }
}
