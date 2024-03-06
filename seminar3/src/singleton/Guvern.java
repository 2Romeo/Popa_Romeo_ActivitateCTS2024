package singleton;

public class Guvern {
    private int nrGuvernatori;
    private String numePrimMinistru;
    private int nrLuni;
    private static Guvern instanta = null;

    public synchronized static Guvern GetInstance(int nrGuvernatori, String numePrimMinistru, int nrLuni){ // constructor thread 1 blockeaza/previne constructor thread 2
        if(instanta == null){
            instanta = new Guvern(nrGuvernatori, numePrimMinistru, nrLuni);
        }
        return instanta;
    }

    private Guvern(){
        nrGuvernatori=0;
        numePrimMinistru="";
        nrLuni=0;
    }
    private Guvern(int nrGuvernatori, String numePrimMinistru, int nrLuni) {
        this.nrGuvernatori = nrGuvernatori;
        this.numePrimMinistru = numePrimMinistru;
        this.nrLuni = nrLuni;
    }

    public int getNrGuvernatori() {
        return nrGuvernatori;
    }

    public String getNumePrimMinistru() {
        return numePrimMinistru;
    }

    public int getNrLuni() {
        return nrLuni;
    }

    public void setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
    }

    public void setNumePrimMinistru(String numePrimMinistru) {
        this.numePrimMinistru = numePrimMinistru;
    }

    public void setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
    }
}
