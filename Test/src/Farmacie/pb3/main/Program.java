package Farmacie.pb3.main;

import Farmacie.pb3.builder.Factura;
import Farmacie.pb3.builder.FacturaBuilder;

public class Program {
    public static void main(String[] args) {
        Factura factura = new FacturaBuilder().adaugaCardFidelitate(true).adaugaPungi(1).areCotaTVA(2.2f).build();
        System.out.println(factura.toString());
    }
}
