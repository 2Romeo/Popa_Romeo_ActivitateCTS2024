package decoratoare_bilete;

import bilete.BiletAbstract;

public class BiletLocal extends Decorator{

    public BiletLocal(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    public BiletLocal(String gazda, String oaspeti, float pret, BiletAbstract biletDecorat) {
        super(gazda, oaspeti, pret, biletDecorat);
    }

    @Override
    public void printareBilet() {
        this.getBiletAbstract().printareBilet();
        System.out.println("Oaspeti " + this.getGazda().toString());
    }

    @Override
    public void aplicaDiscountBilet() {
        this.setPret(this.getBiletAbstract().getPret()*0.9f);
    }
}
