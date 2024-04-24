package observer;

public class Client implements Observer{
    String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + " a primit mesajul: " + mesaj);
    }
}
