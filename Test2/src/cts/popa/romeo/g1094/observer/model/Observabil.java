package cts.popa.romeo.g1094.observer.model;

public interface Observabil {
    public void adauga(Observer obs);
    public void sterge(Observer obs);
    public void notificaObserveri(String mesaj);
}
