package Strategy.Sportiv.pb11.main;

import Strategy.Sportiv.pb11.classes.Client;
import Strategy.Sportiv.pb11.classes.ModVerificare;
import Strategy.Sportiv.pb11.classes.PlataPeluza;

public class Program {

    public static void main(String[] args) {
        ModVerificare mod1 = new PlataPeluza();
        ModVerificare mod2 = new PlataPeluza();
        ModVerificare mod3 = new PlataPeluza();

        Client c1 =new Client(mod1);
        c1.verifica(1);
    }
}
