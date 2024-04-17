package Restaurant.pb3.SimpleFactory.classes;


public class SupaCiuperci extends Supa {
    public SupaCiuperci(String nume){super(nume);}
    @Override
    public void getInformatii() { System.out.println("supa ciperci " + this.nume);}
}
