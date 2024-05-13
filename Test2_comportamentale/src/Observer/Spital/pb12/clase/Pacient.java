package Observer.Spital.pb12.clase;

public class Pacient implements Observer{
    public Pacient() {
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("notificare primita: " + mesaj);
    }
}
