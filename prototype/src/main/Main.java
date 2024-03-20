package main;

import model.AbstractReteta;
import model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> newMap = new HashMap();
        newMap.put("HCL",3.2);
        newMap.put("vitamina c",4.4);
        newMap.put("vitamida d",44.2);

        Reteta reteta1 = new Reteta("milka", newMap, 51.8);
        AbstractReteta reteta2 = reteta1.cloneaza();

        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}