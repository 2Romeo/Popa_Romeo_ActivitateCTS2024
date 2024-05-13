package Template.Restaurant.pb14.clase;

public abstract class TemplateOcupareMasa {

    public final void ocupaMasa(){
        if(curataMasa()){
            aseazaServetele();
            aseazaTacamuri();
            invitaPersoanele();
        }

    }

    protected abstract boolean curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();
    protected abstract void invitaPersoanele();
}
