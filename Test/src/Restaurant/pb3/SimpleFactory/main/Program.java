package Restaurant.pb3.SimpleFactory.main;

import Restaurant.pb3.SimpleFactory.Tipuri;
import Restaurant.pb3.SimpleFactory.classes.Supa;
import Restaurant.pb3.SimpleFactory.classes.factory.SupaFactory;

public class Program {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory();
        Supa supaCiuperci = supaFactory.getSupa(Tipuri.CIUPERCI, "nume");
        Supa supaLegume = supaFactory.getSupa(Tipuri.LEGUME, "nume");

        supaCiuperci.getInformatii();
        supaLegume.getInformatii();
    }
}
