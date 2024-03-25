package Restaurant.pb3.FactoryMethod.classes;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(String name) {
        super(name);
    }

    @Override
    public void GetInformatii() {
        System.out.println("supa ciuperci" + this.name);
    }
}
