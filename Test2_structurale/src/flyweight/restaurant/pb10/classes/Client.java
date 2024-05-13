package flyweight.restaurant.pb10.classes;

public class Client implements Flyweight{
    String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezervaMasa(Rezervare rezervare) {
        System.out.println("masa rezervata pentru " + nume);
    }
}
