package Observer.Spital.pb12.main;

import Observer.Spital.pb12.clase.Pacient;
import Observer.Spital.pb12.clase.VirusObserver;

public class Main {
    public static void main(String[] args) {
        VirusObserver ovs1 = new VirusObserver();
        Pacient p1 = new Pacient();
        Pacient p2 = new Pacient();
        Pacient p3 = new Pacient();

        ovs1.abonare(p1);
        ovs1.abonare(p2);
        ovs1.notificareObserveri("zzz");
    }
}
