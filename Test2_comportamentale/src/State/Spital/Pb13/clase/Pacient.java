package State.Spital.Pb13.clase;

public class Pacient {
    String nume;
    State stare = null;

    public void schimbaStare(State stare) {
        this.stare = stare;
    }

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void interneaza(){
        if(stare == null){
            stare = new Internat();
        }
    }

    public void treceSubObservatie(){
        if(stare instanceof Internat){
            stare = new SubObservatie();
        }
    }

    public void externeaza(){
        if(stare != null){
            stare = new Externat();
        }
    }
}
