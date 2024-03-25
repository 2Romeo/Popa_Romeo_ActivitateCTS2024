package Restaurant.pb2.Builderv1;

public interface AbstractBuilder {
    public abstract AbstractBuilder aseazaLaGeam(boolean bool);
    public abstract AbstractBuilder adaugaScaunErgonomic(boolean bool);
    public abstract AbstractBuilder adaugaDecoratiunie(boolean bool);
    public abstract AbstractBuilder adaugaMuzica(boolean bool);

    public abstract Rezervare getRezervare();
}
