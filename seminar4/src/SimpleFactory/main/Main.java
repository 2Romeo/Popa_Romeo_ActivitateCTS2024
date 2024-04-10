package SimpleFactory.main;

import SimpleFactory.classes.PersonalSpital;
import SimpleFactory.classes.fabrica.FabricaPersonal;
import SimpleFactory.classes.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        PersonalSpital medic = fabricaPersonal.createPersonal(TipPersonal.MEDIC, "gigel", 7000);
        PersonalSpital asistent = fabricaPersonal.createPersonal(TipPersonal.ASISTENT, "ionel", 5000);
        PersonalSpital brancardier = fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER, "mirel", 4000);
        medic.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();
    }
}
