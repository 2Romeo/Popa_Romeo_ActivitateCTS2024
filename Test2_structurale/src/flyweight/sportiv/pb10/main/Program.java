package flyweight.sportiv.pb10.main;

import flyweight.sportiv.pb10.classes.Flyweight;
import flyweight.sportiv.pb10.classes.FlyweightFactory;
import flyweight.sportiv.pb10.classes.Persoana;
import flyweight.sportiv.pb10.classes.Tribuna;

public class Program {
    public static void main(String[] args) {
        Tribuna t1 = new Tribuna("t1");
        Persoana p1 = new Persoana(2,3,5);
        FlyweightFactory f1 = new FlyweightFactory();
        f1.GetInstance("nume").Desenare(p1);
    }
}
