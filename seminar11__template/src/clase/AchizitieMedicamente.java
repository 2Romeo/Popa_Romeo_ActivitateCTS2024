package clase;

import java.util.HashMap;
import java.util.Map;

public abstract class AchizitieMedicamente {
    Map<String,Integer> stocuri;
    AchizitieMedicamente(){
        stocuri = new HashMap<>();
        stocuri.put("Paracetamol",34);
        stocuri.put("Algocalmin",24);
        stocuri.put("Nurofen",51);
    }

    public final void achizitioneazaMedicamente(){
        primesteReteta();
        if(verificaStoc() == true){
            aducereMedicamente();
            incaseaza();
            emitereBon();
        } else{
            respingeAchizitie();
        }
    }

    public abstract void primesteReteta();
    public abstract boolean verificaStoc();
    public abstract void aducereMedicamente();
    public abstract void incaseaza();
    public abstract void emitereBon();
    public abstract void respingeAchizitie();
}
