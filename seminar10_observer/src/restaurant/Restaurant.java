package restaurant;

public class Restaurant extends Subiect{ //observabil
    String adresa;

    public Restaurant(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void notificareMeniuNou() {
        notificaObservatori(" meniu nou! la adresa "+adresa );
    }

    @Override
    public void notificareSchimbareMeniu() {
        notificaObservatori("meniu schimbat! la adresa "+ adresa);
    }

    @Override
    public void notificareEveniment(String data) {
        notificaObservatori("eveniment nou! la adresa "+ adresa + " la data de "+data);
    }
}
