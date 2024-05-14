package cts.popa.romeo.g1094.observer.model;

import cts.popa.romeo.g1094.proxy.model.CameraCCTV;

import java.util.ArrayList;
import java.util.List;

public class Camera implements Observabil, CameraCCTV {
    List<Observer> observeri;

    public Camera() {
        this.observeri = new ArrayList<>();
    }

    @Override
    public void adauga(Observer obs) {
        observeri.add(obs);
    }

    @Override
    public void sterge(Observer obs) {
        observeri.remove(obs);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for(Observer obs:observeri){
            obs.primesteNotificare(mesaj);
        }
    }

    @Override
    public void trimiteImagine() {
        System.out.println("imagine transmisa");
    }

    @Override
    public void activeazaSenzor() {

    }
}
