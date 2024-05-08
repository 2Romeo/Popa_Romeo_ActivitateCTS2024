package program;

import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(1234,3);
        reteta.cumpareMedicamente();

        reteta.solicitaMedicamente();
        reteta.respingeAchizitie();
        reteta.cumpareMedicamente();
        reteta.solicitaMedicamente();

    }
}