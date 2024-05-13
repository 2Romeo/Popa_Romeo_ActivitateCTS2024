package facade.Spital.pb6.clase;

public class Pacient {
    String nume;
    String stare;

    public Pacient(String nume, String stare) {
        this.nume = nume;
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public String getStare() {
        return stare;
    }
}
