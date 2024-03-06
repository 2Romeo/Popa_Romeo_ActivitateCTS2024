package GuverneleLumii.model;

import java.util.HashMap;
import java.util.Map;

public class GuverneRegistry {
    private Map<String,Guvern> guverneleLumii = new HashMap<>();
    private static GuverneRegistry instanta = null;

    private GuverneRegistry() { // constructor default e public
    }

    public static GuverneRegistry GetInstance(){
        if(instanta == null)
        {
            instanta = new GuverneRegistry();
        }

        return instanta;
    }

    public void AddGuvern(String numeTara, String numePrimMinistru, int nrGuvernatori){

        if(guverneleLumii.containsKey(numeTara) != true)
        {
            guverneleLumii.put(numeTara,new Guvern(numeTara,numePrimMinistru,nrGuvernatori));
        }
    }

    public Guvern getGuvern(String numeTara){
        return guverneleLumii.get(numeTara);
    }
}
