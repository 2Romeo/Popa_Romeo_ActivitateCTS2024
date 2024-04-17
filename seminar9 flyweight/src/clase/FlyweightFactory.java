package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String, Flyweight> listaClienti;

    public FlyweightFactory() {
        listaClienti = new HashMap<>();
    }

    public Flyweight GetClient(String numarAsigurare, String nume){
        if(!listaClienti.containsKey(numarAsigurare))
        {
            listaClienti.put(numarAsigurare, new Client(nume, numarAsigurare));
        }
        return listaClienti.get(numarAsigurare);
    }
}
