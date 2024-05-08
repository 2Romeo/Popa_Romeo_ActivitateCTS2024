import clase.AchizitieCuReteta;
import clase.AchizitieMedicamente;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(1);
        Reteta reteta1 = new Reteta(2);
        reteta1.adaugaInListaMedicamente("Paracetamol");
        reteta1.adaugaInListaMedicamente("Nurofen");
        AchizitieMedicamente achizitieMedicamente = new AchizitieCuReteta(reteta1);

        achizitieMedicamente.achizitioneazaMedicamente();
    }
}