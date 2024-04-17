package Restaurant.pb3.FactoryMethod.classes.factory;

import Restaurant.pb3.FactoryMethod.classes.Supa;
import Restaurant.pb3.FactoryMethod.classes.SupaCiuperci;

public class SupaCiuperciFactory implements SupaFactory{
    @Override
    public Supa getSupa(String nume) {
        return new SupaCiuperci(nume);
    }
}
