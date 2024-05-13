package Strategy.Spital.Pb11.classes;

public class Pacient {
    ModPlata modPlata;

    public Pacient(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(){
        modPlata.plateste();
    }
}
