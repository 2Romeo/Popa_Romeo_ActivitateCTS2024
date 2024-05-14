package Proxy.Agentie.model;

public class Persoana implements ProxyAbstract{

    int varsta;

    public Persoana(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public void rezerva() {
        System.out.println("rezervat");
    }
}
