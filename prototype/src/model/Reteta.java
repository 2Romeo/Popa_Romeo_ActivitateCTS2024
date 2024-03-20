package model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements AbstractReteta {
    private String numeMedicament;
    private Map<String, Double> compozitieMedicament;
    private Double gramaj;

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, Double gramaj) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramaj=gramaj;

        Double suma = 0.0;
        for(var entry : compozitieMedicament.entrySet()){
            suma += entry.getValue();
        }

        if(suma < gramaj + 0.1 && suma > gramaj - 0.1){
            throw new RuntimeException("gramaj incorect");
        }
    }

    private Reteta(){
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", compozitieMedicament=").append(compozitieMedicament);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractReteta cloneaza() {
        Reteta reteta = new Reteta();
        reteta.numeMedicament = this.numeMedicament;
        reteta.compozitieMedicament = new HashMap<>(); // deep copy
        reteta.gramaj = this.gramaj;
        for(String key:this.compozitieMedicament.keySet()){
            compozitieMedicament.put(key,this.compozitieMedicament.get(key));
        }
        return reteta;
    }
}
