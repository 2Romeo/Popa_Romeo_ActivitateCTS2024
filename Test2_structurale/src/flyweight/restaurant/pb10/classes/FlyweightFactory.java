package flyweight.restaurant.pb10.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String, Flyweight> rezervari;

    public FlyweightFactory() {
        rezervari = new HashMap<>();
    }

    public Flyweight GetClient(String nume){
        if(rezervari.get(nume) == null){
            rezervari.put(nume,new Client(nume));
        }
        return rezervari.get(nume);
    }
}
