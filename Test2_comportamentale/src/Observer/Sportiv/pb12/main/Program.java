package Observer.Sportiv.pb12.main;

import Observer.Sportiv.pb12.classes.Observabil.Meci;
import Observer.Sportiv.pb12.classes.Observers.Client;
import Observer.Sportiv.pb12.classes.Observers.Observer ;

public class Program {
    public static void main(String[] args) {
        Meci meci = new Meci();
        Observer o1 = new Client();
        Observer o2 = new Client();
        meci.adaugaObserver(o1);
        meci.adaugaObserver(o2);
        meci.stergeObserver(o2);
        meci.notificaClienti("notifacer");
    }
}
