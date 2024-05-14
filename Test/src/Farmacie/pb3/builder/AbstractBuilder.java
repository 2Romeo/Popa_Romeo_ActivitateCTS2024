package Farmacie.pb3.builder;

public abstract class AbstractBuilder {
    Factura factura;
    public AbstractBuilder() {
        factura = new Factura();
    }

    public abstract AbstractBuilder adaugaPungi(int nr);
    public abstract AbstractBuilder adaugaCardFidelitate(boolean bool);
    public abstract AbstractBuilder platesteCuCard(boolean bool);
    public abstract AbstractBuilder areCotaTVA(float cota);

    public abstract Factura build();
}
