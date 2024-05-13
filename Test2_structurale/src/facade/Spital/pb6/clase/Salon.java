package facade.Spital.pb6.clase;

public class Salon {
    int id;
    int nrLocuriDisp;

    public Salon(int id, int nrLocuriDisp) {
        this.id = id;
        this.nrLocuriDisp = nrLocuriDisp;
    }

    public void ocupaPat(){
        if(nrLocuriDisp > 0){
            nrLocuriDisp--;
            System.out.println("pacientul ocupa un pat");
        }
    }
    public int getId() {
        return id;
    }

    public int getNrLocuriDisp() {
        return nrLocuriDisp;
    }
}
