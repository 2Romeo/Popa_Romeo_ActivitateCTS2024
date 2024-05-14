package Farmacie.pb3.builder;

public class FacturaBuilder extends AbstractBuilder{
    public FacturaBuilder() {

    }

    @Override
    public AbstractBuilder adaugaPungi(int nr) {
        this.factura.setNumarPungi(nr);
        return this;
    }

    @Override
    public AbstractBuilder adaugaCardFidelitate(boolean bool) {
        this.factura.setCardFidelitate(bool);
        return this;
    }

    @Override
    public AbstractBuilder platesteCuCard(boolean bool) {
        this.factura.setPlataCuCard(bool);;
        return this;
    }

    @Override
    public AbstractBuilder areCotaTVA(float cota) {
        this.factura.setCotaTVA(cota);
        return this;
    }

    @Override
    public Factura build() {
        return factura;
    }
}
