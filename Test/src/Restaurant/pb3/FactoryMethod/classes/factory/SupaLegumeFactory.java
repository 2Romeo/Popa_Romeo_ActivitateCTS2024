package Restaurant.pb3.FactoryMethod.classes.factory;

import Restaurant.pb3.FactoryMethod.classes.Supa;
import Restaurant.pb3.FactoryMethod.classes.SupaLegume;

public class SupaLegumeFactory implements SupaFactory{
    @Override
    public Supa getSupa(String nume) {
        return new SupaLegume(nume);
    }
}
