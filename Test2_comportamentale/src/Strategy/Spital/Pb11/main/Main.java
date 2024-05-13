package Strategy.Spital.Pb11.main;

import Strategy.Spital.Pb11.classes.Card;
import Strategy.Spital.Pb11.classes.Cash;
import Strategy.Spital.Pb11.classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient(new Card());
        Pacient p2 = new Pacient(new Cash());
        p1.plateste();
        p2.plateste();
    }
}
