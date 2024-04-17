package Restaurant.pb2.Builderv1;

public class Builder implements AbstractBuilder{
    private Rezervare rezervare;

    public Builder() {
        rezervare = new Rezervare();
    }

    @Override
    public AbstractBuilder aseazaLaGeam(boolean bool) {
        this.rezervare.setAsezatLaGeam(bool);
        return this;
    }

    @Override
    public AbstractBuilder adaugaScaunErgonomic(boolean bool) {
        this.rezervare.setAreScaunErgonomic(bool);
        return this;
    }

    @Override
    public AbstractBuilder adaugaDecoratiunie(boolean bool) {
        this.rezervare.setAreMasaDecorata(bool);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMuzica(boolean bool) {
        this.rezervare.setAreMuzica(bool);
        return this;
    }

    public Rezervare getRezervare() {
        return rezervare;
    }
}
