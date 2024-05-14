package Proxy.Restaurant.pb9.classes;

public class ProxyCerere implements ProxyAbstract {
    public ProxyAbstract rezervare;

    public ProxyCerere(ProxyAbstract rezervare) {
        this.rezervare = rezervare;
    }

    public ProxyAbstract getRezervare() {
        return rezervare;
    }

    @Override
    public void rezerva(Cerere cerere) {
        if(cerere.nrPers > 4){
            getRezervare().rezerva(cerere);
        }else{
            System.out.println("nr pers insuficiente");
        }
    }
}
