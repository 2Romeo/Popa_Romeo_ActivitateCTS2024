package Proxy.Spital.pb9.classes;

public class ProxyInternare extends InternareAbstract {
    Internare internare;

    public ProxyInternare(Internare proxy) {
        this.internare = proxy;
    }

    @Override
    public void interneaza() {
        if(internare.getPacient().areAsigurare) {
            internare.interneaza();
        }else{
            System.out.println("nu are asigurare");
        }
    }
}
