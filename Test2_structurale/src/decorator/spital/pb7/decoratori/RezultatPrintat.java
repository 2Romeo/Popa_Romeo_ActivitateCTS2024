package decorator.spital.pb7.decoratori;

import decorator.spital.pb7.claseAbstracte.Decorator;
import decorator.spital.pb7.claseAbstracte.RezultatDecorat;

public class RezultatPrintat extends Decorator {
    public RezultatPrintat(RezultatDecorat rezultatDecorat) {
        super(rezultatDecorat);
    }

    @Override
    public void oferaRezultate() {
        super.getRezultatDecorat().oferaRezultate();
        System.out.println("rezultat printat");
    }
}
