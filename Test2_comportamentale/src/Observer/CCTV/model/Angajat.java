package Observer.CCTV.model;

public class Angajat implements Observer{
    String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotif(String mesaj) {
        System.out.println(nume + " a primit mesajul " + mesaj);
    }
}
