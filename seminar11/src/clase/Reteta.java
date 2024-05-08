package clase;

public class Reteta {
    private int nrRetata;
    private int nrMedicamente;
    private State stare;

    public Reteta(int nrRetata, int nrMedicamente) {
        this.nrRetata = nrRetata;
        this.nrMedicamente = nrMedicamente;
        this.stare = new Emisa();
    }

    public void cumpareMedicamente(){
        if(this.stare instanceof Solicitata) {
            State state = new Achizitionata();
            state.schimbaStarea(this);
        }else{
            System.out.println("medicamentele din reteta " + nrRetata + " nu pot fi achizitionate ");
        }
    }
    public void solicitaMedicamente(){
        if(this.stare instanceof Emisa) {
            State state = new Solicitata();
            state.schimbaStarea(this);
        }else{
            System.out.println("medicamentele din reteta " + nrRetata + " nu pot fi solicitate ");
        }
    }

    public void respingeAchizitie(){
        if(this.stare instanceof Solicitata) {
            State state = new Emisa();
            state.schimbaStarea(this);
            System.out.println("medicamentele din reteta " + nrRetata + " nu exista ");
        }else if(this.stare instanceof Emisa) {
            System.out.println("reteta nu poate fi respinsa");
        }
    }

    protected void setStare(State stare) {
        this.stare = stare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nrRetata=").append(nrRetata);
        sb.append(", nrMedicamente=").append(nrMedicamente);
        sb.append(", stare=").append(stare);
        sb.append('}');
        return sb.toString();
    }
}
