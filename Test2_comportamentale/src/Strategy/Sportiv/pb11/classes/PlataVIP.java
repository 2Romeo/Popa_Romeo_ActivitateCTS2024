package Strategy.Sportiv.pb11.classes;

import javax.management.modelmbean.ModelMBean;

public class PlataVIP implements ModVerificare {
    @Override
    public void verifica(int tipBilet) {
        System.out.println("verifiare vip");
    }
}
