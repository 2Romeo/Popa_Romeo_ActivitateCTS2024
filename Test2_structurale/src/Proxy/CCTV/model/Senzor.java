package Proxy.CCTV.model;

public class Senzor implements ProxyAbstract {
    boolean senzorActivat;

    public Senzor(boolean senzorActivat) {
        this.senzorActivat = senzorActivat;
    }

    public void setSenzorActivat(boolean senzorActivat) {
        this.senzorActivat = senzorActivat;
    }

    @Override
    public void faPoza(Senzor senzor) {

    }
}
