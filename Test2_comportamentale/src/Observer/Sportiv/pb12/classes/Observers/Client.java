package Observer.Sportiv.pb12.classes.Observers;

public class Client implements Observer{
    public Client() {
    }

    @Override
    public void primesteNotif(String mesaj) {
        System.out.println("notificare primita:" + mesaj);
    }
}
