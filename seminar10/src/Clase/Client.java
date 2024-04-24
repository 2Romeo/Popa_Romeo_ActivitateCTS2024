package Clase;

public class Client {
    String nume;
    ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        modPlata = new Card();
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void realizeazaPlata(int suma){
        modPlata.plateste(suma,nume);
    }
}
