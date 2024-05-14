package Singleton.singleton;

import java.util.*;

public class Cuptor {
    private Map<String,Preparat> preparate = new HashMap();
    private List<Cuptor> cuptoare;
    private float gradMaxim;
    private float timpAsteptare = 0;
    private static Cuptor instanta = null;
    private Cuptor(){}
    public static Cuptor getInstance(){
        if(instanta == null)
        {
            instanta = new Cuptor();
        }

        return instanta;
    };
    public void addCuptor(Cuptor cuptor){
        cuptoare.add(cuptor);
    }

    public void addPreparat(String name, Preparat preparat){
        preparate.put(name,preparat);
        Cuptor min = cuptoare.get(0);
        for(Cuptor cuptor:cuptoare)
        {
            if(cuptor.timpAsteptare < min.timpAsteptare && gradMaxim>=preparat.getTemp()){
                min = cuptor;
            }
        }
        min.timpAsteptare+=preparat.getTimp();
        preparate.put(name,preparat);
    }


}
