package clase;

public class Bilet implements BiletAbstract{
    private String gazda;
    private String oaspeti;
    private float pret;

    public Bilet(String gazda, String oaspeti, float pret) {
        this.gazda = gazda;
        this.oaspeti = oaspeti;
        this.pret = pret;
    }

    @Override
    public void vanzareBilet(Client client) {

    }

    public String getGazda() {
        return gazda;
    }

    public void setGazda(String gazda) {
        this.gazda = gazda;
    }

    public String getOaspeti() {
        return oaspeti;
    }

    public void setOaspeti(String oaspeti) {
        this.oaspeti = oaspeti;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}
