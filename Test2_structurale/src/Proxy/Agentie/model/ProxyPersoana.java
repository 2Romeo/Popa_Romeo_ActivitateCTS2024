package Proxy.Agentie.model;

public class ProxyPersoana implements ProxyAbstract{
    ProxyAbstract entitate;

    public ProxyPersoana(ProxyAbstract entitate) {
        this.entitate = entitate;
    }


    @Override
    public void rezerva() {
        if(((Persoana)entitate).getVarsta() > 15){
            entitate.rezerva();
        } else {
            System.out.println("nu se poate");
        }
    }
}
