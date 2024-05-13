package flyweight.restaurant.pb10.main;

import flyweight.restaurant.pb10.classes.FlyweightFactory;
import flyweight.restaurant.pb10.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        factory.GetClient("ion").rezervaMasa(new Rezervare("r1"));
        factory.GetClient("ion").rezervaMasa(new Rezervare("r2"));
    }
}
