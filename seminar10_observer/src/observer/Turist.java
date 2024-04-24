package observer;

public class Turist implements Observer{
    String nume;

    public Turist(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("turistul " + nume + " a primit notificarea: " + mesaj);
    }
}
