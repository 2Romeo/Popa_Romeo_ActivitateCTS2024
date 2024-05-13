package Template.Restaurant.pb14.clase;

public class OcupareMasaRestaurant extends TemplateOcupareMasa{
    @Override
    protected  boolean curataMasa() {
        return true;
    }

    @Override
    protected  void aseazaServetele() {
        System.out.println("servetele asezate");
    }

    @Override
    protected  void aseazaTacamuri() {
        System.out.println("tacamuri asezate");
    }

    @Override
    protected  void invitaPersoanele() {
        System.out.println("persoane invitate");
    }
}
