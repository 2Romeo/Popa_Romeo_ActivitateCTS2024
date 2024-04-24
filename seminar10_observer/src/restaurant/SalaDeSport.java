package restaurant;

public class SalaDeSport extends Subiect{

    public void notificareMeciVolley(){
        notificaObservatori("In sala de sport are loc un meci de volei");
    }
    @Override
    public void notificareMeniuNou() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void notificareSchimbareMeniu() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void notificareEveniment(String data) {
        notificaObservatori("eveniment nou in sala de sport la data de "+data);
    }
}
