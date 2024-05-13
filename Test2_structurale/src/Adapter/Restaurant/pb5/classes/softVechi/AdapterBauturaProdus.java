package Adapter.Restaurant.pb5.classes.softVechi;


import Adapter.Restaurant.pb5.classes.softNou.Bautura;

// Object Adapter
public class AdapterBauturaProdus extends Produs {
    private Bautura bautura;

    public AdapterBauturaProdus(Bautura bautura) {
        super(bautura.getDenumire(), bautura.getPret());
        this.bautura = bautura;
    }
}
