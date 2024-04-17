package clase;

public class Reteta {
    private String nume;
    private int numarRetata;
    private int numarMedicamente;

    public Reteta(String nume, int numarRetata, int numarMedicamente) {
        this.nume = nume;
        this.numarRetata = numarRetata;
        this.numarMedicamente = numarMedicamente;
    }

    public String getNume() {
        return nume;
    }

    public int getNumarRetata() {
        return numarRetata;
    }
}
