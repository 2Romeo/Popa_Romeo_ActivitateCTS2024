package decorator.spital.pb7.claseAbstracte;

public abstract class Decorator extends RezultatAbstract{
    RezultatDecorat rezultatDecorat;

    public Decorator(RezultatDecorat rezultatDecorat) {
        this.rezultatDecorat = rezultatDecorat;
    }

    public RezultatDecorat getRezultatDecorat() {
        return rezultatDecorat;
    }
}
