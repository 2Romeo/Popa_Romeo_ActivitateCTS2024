package Proxy.Restaurant.pb9.classes;

public class Cerere implements ProxyAbstract {
    int nrPers;

    public Cerere(int nrPers) {
        this.nrPers = nrPers;
    }

    @Override
    public void rezerva(Cerere cerere) {
        System.out.println("cerere rezervata pentru " + nrPers);
    }
}
