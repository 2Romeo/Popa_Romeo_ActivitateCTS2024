package decorator.spital.pb7.main;

import decorator.spital.pb7.claseAbstracte.Decorator;
import decorator.spital.pb7.claseAbstracte.RezultatDecorat;
import decorator.spital.pb7.decoratori.RezultatOnline;
import decorator.spital.pb7.decoratori.RezultatPrintat;

public class Program {
    public static void main(String[] args) {
        RezultatDecorat rezultatDecorat = new RezultatDecorat();
        Decorator d1 = new RezultatOnline(rezultatDecorat);
        Decorator d2 = new RezultatPrintat(rezultatDecorat);

        d1.oferaRezultate();
        d2.oferaRezultate();
    }
}
