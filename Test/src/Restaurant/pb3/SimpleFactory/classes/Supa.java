package Restaurant.pb3.SimpleFactory.classes;

public abstract class Supa {
    protected String nume;

    public Supa(String nume) {
        this.nume = nume;
    }

    public abstract void getInformatii();
}
