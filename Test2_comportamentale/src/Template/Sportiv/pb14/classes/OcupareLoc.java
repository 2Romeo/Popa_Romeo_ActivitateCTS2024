package Template.Sportiv.pb14.classes;

public class OcupareLoc extends TemplateOcupare{
    boolean controlat;

    public OcupareLoc(boolean controlat) {
        this.controlat = controlat;
    }

    @Override
    public boolean control() {
        return controlat;
    }

    @Override
    public void intrare() {
System.out.println("intrat");
    }

    @Override
    public void asezare() {
System.out.println("asezat");
    }
}
