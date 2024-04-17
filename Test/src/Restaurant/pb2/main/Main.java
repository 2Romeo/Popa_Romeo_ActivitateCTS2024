package Restaurant.pb2.main;

import Restaurant.pb2.Builderv1.Builder;
import Restaurant.pb2.Builderv1.Rezervare;

public class Main {
    public static void main(String[] args) {

        Rezervare rezervare = new Builder().adaugaMuzica(true).adaugaDecoratiunie(true).getRezervare();
        System.out.print(rezervare);
    }
}