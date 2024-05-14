package Farmacie.pb3.builder;

public class Factura {
    private boolean cardFidelitate;
    private boolean plataCuCard;
    private int numarPungi = 0;
    private float cotaTVA = .0f;

    public Factura() {
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi += numarPungi;
    }

    public void setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("cardFidelitate=").append(cardFidelitate);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", numarPungi=").append(numarPungi);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
