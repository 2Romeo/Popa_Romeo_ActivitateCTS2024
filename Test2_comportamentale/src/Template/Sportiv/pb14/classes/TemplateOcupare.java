package Template.Sportiv.pb14.classes;

public abstract class TemplateOcupare {
    public final void ocupaLoc(){
        if(control()){
            intrare();
            asezare();
        }
    }
    public abstract boolean control();
    public abstract void intrare();
    public abstract void asezare();
}
