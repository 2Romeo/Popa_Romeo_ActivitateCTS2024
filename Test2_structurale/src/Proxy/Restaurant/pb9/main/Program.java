package Proxy.Restaurant.pb9.main;

import Proxy.Restaurant.pb9.classes.Cerere;
import Proxy.Restaurant.pb9.classes.ProxyAbstract;
import Proxy.Restaurant.pb9.classes.ProxyCerere;
import Proxy.Restaurant.pb9.classes.Rezervare;

public class Program {



    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare();
        ProxyCerere proxy = new ProxyCerere(rezervare);
        Cerere c1 = new Cerere(2);
        Cerere c2 = new Cerere(5);
        proxy.rezerva((Cerere) c1);
        proxy.rezerva((Cerere)c2);
    }

}
