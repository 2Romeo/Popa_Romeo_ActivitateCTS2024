package Adapter.Banca.pb5.main;

import Adapter.Banca.pb5.classes.Adaptee.CrediteLeasing;
import Adapter.Banca.pb5.classes.Adapter.Adapter;

public class Program {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new CrediteLeasing());
        adapter.oferaleasing();
    }
}
