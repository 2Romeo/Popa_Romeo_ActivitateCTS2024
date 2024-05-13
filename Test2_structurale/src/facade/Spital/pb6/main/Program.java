package facade.Spital.pb6.main;

import facade.Spital.pb6.clase.InternareFacade;
import facade.Spital.pb6.clase.Pacient;

public class Program {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("1","ok");
        Pacient p2 = new Pacient("2","rau");

        InternareFacade facade = new InternareFacade();
        facade.interneazaPacient(p1);
        facade.interneazaPacient(p2);
    }
}
