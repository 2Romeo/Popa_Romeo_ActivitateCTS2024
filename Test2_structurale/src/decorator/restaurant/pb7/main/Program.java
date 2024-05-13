package decorator.restaurant.pb7.main;

import decorator.restaurant.pb7.classes.Decorator;
import decorator.restaurant.pb7.classes.NotaDePlata;
import decorator.restaurant.pb7.decoratori.DecoratorNota;

public class Program {
    public static void main(String[] args) {
        NotaDePlata nota = new NotaDePlata(20.2f);
        Decorator d1 = new DecoratorNota(nota);
        d1.printeaza();
    }
}
