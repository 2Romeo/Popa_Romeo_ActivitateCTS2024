package model;

public class Pacient {
    String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    protected Pacient() {
    }
    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciCamera, boolean areHalatInterior) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatInterior = areHalatInterior;
    }


    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    protected void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    protected void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalatInterior=").append(areHalatInterior);
        sb.append('}');
        return sb.toString();
    }

    public static class PacientBuilder implements AbstractBuilder{
            private String nume;
            private boolean arePatRabatabil;
            private boolean areMicDejunInclus;
            private boolean arePapuciCamera;
            private boolean areHalatInterior;

        public PacientBuilder(String nume) {
            this.nume = nume;
        }

        public AbstractBuilder adaugaPatRabatabil(boolean are) {
                this.arePatRabatabil = are;
                return this;
            }

            @Override
            public AbstractBuilder adaugaMicDejunInclus(boolean are) {
                this.areMicDejunInclus = are;
                return this;
            }

            @Override
            public AbstractBuilder adaugaPapuciCamera(boolean are) {
                this.arePapuciCamera = are;
                return this;
            }

            @Override
            public AbstractBuilder adaugaHalatInterior(boolean are) {
                this.areHalatInterior = are;
                return this;
            }

            public Pacient build() {
                return new Pacient(nume, arePatRabatabil, areMicDejunInclus, arePapuciCamera, areHalatInterior);
            }
        }
    }


