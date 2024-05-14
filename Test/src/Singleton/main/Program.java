package Singleton.main;

import Singleton.singleton.Cuptor;
import Singleton.singleton.Preparat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Cuptor instanta = Cuptor.getInstance();
        instanta.addPreparat("nume1",new Preparat(2.2f,3.3));
    }
}
