package clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private int nrReteta;
    private List<String> listaMedicamente = new ArrayList<>();

    public Reteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public List<String> getListaMedicamente() {
        return listaMedicamente;
    }

    public void adaugaInListaMedicamente(String medicament) {
        listaMedicamente.add(medicament);
    }
}
