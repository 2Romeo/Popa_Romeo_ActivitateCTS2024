package facade.Spital.pb6.clase;

public class Medic {
    String nume;

    public boolean verificaPacient(Pacient pacient){
        return !pacient.getStare().toLowerCase().equals("ok");
    }
}
