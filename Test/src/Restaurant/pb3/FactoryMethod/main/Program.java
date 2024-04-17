package Restaurant.pb3.FactoryMethod.main;

import Restaurant.pb3.FactoryMethod.classes.Supa;
import Restaurant.pb3.FactoryMethod.classes.factory.SupaCiuperciFactory;
import Restaurant.pb3.FactoryMethod.classes.factory.SupaFactory;
import Restaurant.pb3.FactoryMethod.classes.factory.SupaLegumeFactory;

public class Program {
    public static void main(String[] args) {
        Supa supaCiuperci = new SupaCiuperciFactory().getSupa("nume");
        Supa supaLegume = new SupaLegumeFactory().getSupa("nume");

        supaCiuperci.GetInformatii();
        supaLegume.GetInformatii();
    }
}
