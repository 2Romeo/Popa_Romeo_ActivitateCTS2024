package clase;

public class Client {
    String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        //setup chain of command
        ModPlata modPlata1 = new Card(36);
        ModPlata modplata2 = new Cash(73);
        ModPlata modPlata3 = new PlataInvalida();

        modPlata = modPlata1;
        modPlata1.setSuccesor(modplata2);
        modplata2.setSuccesor(modPlata3);
        this.nume = nume;
    }

    public void realizeazaPlata(int suma){
        modPlata.plateste(suma,this.nume);
    }
}
