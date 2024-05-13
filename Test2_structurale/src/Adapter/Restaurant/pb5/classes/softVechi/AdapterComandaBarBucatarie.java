package Adapter.Restaurant.pb5.classes.softVechi;


import Adapter.Restaurant.pb5.classes.softNou.Bar;
import Adapter.Restaurant.pb5.classes.softNou.Bautura;

// adapter comanda bar -> bucatarie
// Class Adapter
public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie {

    @Override
    public void adaugareProdus(Produs produs) {
        // aici ne-ar fi trebuit un adapter de clase, nu obiecte...
        Bautura bautura = new Bautura(produs.getDenumire(), produs.getPret(), 0);
        super.adaugaBautura(bautura);
    }

    @Override
    public void printareBon() {
        super.tiparesteNota();
    }
}
