package Proxy.Spital.pb9.main;

import Proxy.Spital.pb9.classes.Internare;
import Proxy.Spital.pb9.classes.InternareAbstract;
import Proxy.Spital.pb9.classes.Pacient;
import Proxy.Spital.pb9.classes.ProxyInternare;

public class Program {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("ion",true);
        Pacient p2 = new Pacient("ion1",false);
        InternareAbstract internareAbstract = new Internare(p1);
        InternareAbstract internareAbstract2 = new Internare(p2);
        ProxyInternare proxyInternare = new ProxyInternare((Internare)internareAbstract);
        proxyInternare.interneaza();

        ProxyInternare proxyInternare2 = new ProxyInternare((Internare)internareAbstract2);
        proxyInternare2.interneaza();
    }
}
