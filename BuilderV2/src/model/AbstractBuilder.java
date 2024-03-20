package model;

public interface AbstractBuilder {
    public abstract AbstractBuilder adaugaPatRabatabil(boolean are);
    public abstract AbstractBuilder adaugaMicDejunInclus(boolean are);
    public abstract AbstractBuilder adaugaPapuciCamera(boolean are);
    public abstract AbstractBuilder adaugaHalatInterior(boolean are);

    public abstract Pacient build();
}
