package Restaurant.pb3.SimpleFactory.classes.factory;

import Restaurant.pb3.SimpleFactory.Tipuri;
import Restaurant.pb3.SimpleFactory.classes.Supa;
import Restaurant.pb3.SimpleFactory.classes.SupaCiuperci;
import Restaurant.pb3.SimpleFactory.classes.SupaLegume;

public class SupaFactory {
    public SupaFactory(){}
    public Supa getSupa(Tipuri tipSupa, String nume){
        switch(tipSupa){
            case CIUPERCI -> {
                return new SupaCiuperci(nume);
            }
            case LEGUME ->{ return new SupaLegume(nume);
            }
            default -> throw new RuntimeException("nu exista return type");
        }
    }
}
