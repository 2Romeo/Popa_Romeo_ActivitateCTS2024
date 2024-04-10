package decoratoare_bilete;

import bilete.*;

public class BiletNational extends Decorator {

    private static double discount = 0.85;
    public BiletNational(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    public BiletNational(String gazda, String oaspeti, float pret, BiletAbstract biletDecorat) {
        super(gazda, oaspeti, pret, biletDecorat);
    }

    @Override
    public void printareBilet() {
        this.getBiletAbstract().printareBilet();
        System.out.println("Echipa nationala " + this.getGazda().toString());
    }

    @Override
    public void aplicaDiscountBilet() {
        this.setPret(this.getBiletAbstract().getPret()*0.9f);
    }
}
