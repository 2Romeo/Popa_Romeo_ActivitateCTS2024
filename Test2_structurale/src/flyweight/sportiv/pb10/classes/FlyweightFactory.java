package flyweight.sportiv.pb10.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String,Flyweight> lista = new HashMap<>();

    public Flyweight GetInstance(String nume){
        if(!lista.containsKey(nume)){
            lista.put(nume,new Tribuna(nume));
        }
        return lista.get(nume);
    }
}
