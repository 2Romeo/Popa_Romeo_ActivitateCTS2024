package Restaurant.pb2.Builderv1;

public class Rezervare {
    private boolean asezatLaGeam;
    private boolean areScaunErgonomic;
    private boolean areMasaDecorata;
    private boolean areMuzica;

    public Rezervare() {
        this.asezatLaGeam = false;
        this.areScaunErgonomic = false;
        this.areMasaDecorata = false;
        this.areMuzica = false;
    }

    public void setAsezatLaGeam(boolean asezatLaGeam) {
        this.asezatLaGeam = asezatLaGeam;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata = areMasaDecorata;
    }

    public void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("asezatLaGeam=").append(asezatLaGeam);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areMasaDecorata=").append(areMasaDecorata);
        sb.append(", areMuzica=").append(areMuzica);
        sb.append('}');
        return sb.toString();
    }
}
