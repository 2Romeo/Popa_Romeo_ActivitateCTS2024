package Proxy.Spital.pb9.classes;

public class Internare extends InternareAbstract{
    Pacient pacient;

    public Internare(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void interneaza() {
        System.out.println("client internat " + pacient.nume);
    }

    public Pacient getPacient() {
        return pacient;
    }
}
