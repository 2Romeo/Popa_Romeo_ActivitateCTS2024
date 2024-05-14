package cts.popa.romeo.g1094.observer.model;

public class Administrator implements Observer{
    String nume;

    public Administrator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + " mesaj primit " + mesaj);
    }
}
