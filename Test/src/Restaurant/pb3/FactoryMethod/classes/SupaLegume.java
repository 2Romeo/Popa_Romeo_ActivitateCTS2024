package Restaurant.pb3.FactoryMethod.classes;

public class SupaLegume extends Supa{
    public SupaLegume(String name) {
        super(name);
    }

    @Override
    public void GetInformatii(){ System.out.println("supa legume" + this.name);}
}
