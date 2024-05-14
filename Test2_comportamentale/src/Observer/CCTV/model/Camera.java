package Observer.CCTV.model;

import java.util.List;

public class Camera implements CameraCCTV {
    public Camera() {
    }

    @Override
    public void adauga(Observer abs) {
        observeri.add(abs);
    }

    @Override
    public void sterge(Observer abs) {
        observeri.remove(abs);
    }

    @Override
    public void notificaAngajati(String mesaj) {
        for(Observer observer:observeri){
            observer.primesteNotif(mesaj);
        }
    }
}
