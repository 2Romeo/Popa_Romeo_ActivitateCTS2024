package decoratoare_bilete;

import bilete.*;

public abstract class Decorator extends BiletAbstract {

    private BiletAbstract biletAbstract;

    public Decorator(BiletAbstract biletDecorat) { // constructor copiere
        super(biletDecorat.getGazda(), biletDecorat.getOaspeti(), biletDecorat.getPret());
    }

    public Decorator(String gazda, String oaspeti, float pret, BiletAbstract biletDecorat) {
        super(gazda, oaspeti, pret);
        this.biletAbstract = new Bilet(gazda,oaspeti,pret);
    }

    public BiletAbstract getBiletAbstract() {
        return biletAbstract;
    }

    public void setBiletAbstract(BiletAbstract biletAbstract) {
        this.biletAbstract = biletAbstract;
    }

    public abstract void aplicaDiscountBilet();
}
