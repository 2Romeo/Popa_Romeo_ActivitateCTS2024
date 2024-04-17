package main;

import clase.Flyweight;
import clase.FlyweightFactory;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Reteta reteta1 = new Reteta("retata1",12,12);
        Reteta reteta2 = new Reteta("retata2",2,12);
        Reteta reteta3 = new Reteta("retata3",24,12);
        Reteta reteta4 = new Reteta("retata4",25,12);
        Reteta reteta5 = new Reteta("retata5",98,12);

        Flyweight client = factory.GetClient("1234567","Gigel");
        client.achizitionareReteta(reteta1);
        factory.GetClient("1234567","Gigel").achizitionareReteta(reteta2); // intr-o singura locatie din memorie
        factory.GetClient("1234567","Gigel").achizitionareReteta(reteta5);// intr-o singura locatie din memorie
        factory.GetClient("8765432","Ionel").achizitionareReteta(reteta3);// intr-o singura locatie din memorie
        factory.GetClient("8765432","Ionel").achizitionareReteta(reteta4);// intr-o singura locatie din memorie
    }
}