package State.Spital.Pb13.clase;

public class Internat implements State{
    @Override
    public void schimbaState(Pacient pacient) {
        pacient.schimbaStare(this);
    }
}
