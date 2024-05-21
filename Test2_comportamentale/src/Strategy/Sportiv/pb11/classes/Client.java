package Strategy.Sportiv.pb11.classes;

public class Client {
    ModVerificare modVerificare;

    public Client(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verifica(int tipBilet){
        modVerificare.verifica(tipBilet);
    }
}
