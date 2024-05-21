package Proxy.Agentie.main;

import Proxy.Agentie.model.ProxyAbstract;
import Proxy.Agentie.model.ProxyPersoana;
import Proxy.Agentie.model.Persoana;

public class Program {
    public static void main(String[] args) {
        ProxyAbstract proxypersoana = new ProxyPersoana(new Persoana(14));
        ProxyAbstract proxypersoana1 = new ProxyPersoana(new Persoana(16));

        proxypersoana1.rezerva();
        proxypersoana.rezerva();
    }
}
