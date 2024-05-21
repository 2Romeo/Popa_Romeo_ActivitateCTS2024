package Proxy.Restaurant.pb9.classes;

public class Rezervare implements ProxyAbstract {
    public Rezervare(){}
    @Override
    public void rezerva(Cerere cerere) {
        System.out.println("rezervat pentru" +cerere.nrPers);
    }
}
