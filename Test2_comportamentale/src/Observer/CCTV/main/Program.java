package Observer.CCTV.main;

import Observer.CCTV.model.Angajat;
import Observer.CCTV.model.Camera;
import Observer.CCTV.model.Observer;

public class Program {
    public static void main(String[] args) {
        Observer o1 = new Angajat("Ion");
        Observer o2 = new Angajat("Aurel");
        Camera c1 = new Camera();
        c1.adauga(o1);
        c1.adauga(o2);
        c1.notificaAngajati("mesaj");
    }
}
