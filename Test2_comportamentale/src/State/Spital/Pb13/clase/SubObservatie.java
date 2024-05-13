package State.Spital.Pb13.clase;

public class SubObservatie implements State{
    @Override
    public void schimbaState(Pacient pacient) {
        pacient.schimbaStare(this);
    }
}
