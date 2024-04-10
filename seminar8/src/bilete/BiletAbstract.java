package bilete;

public abstract class BiletAbstract {
    private String Gazda;
    private String Oaspeti;
    private float pret;

    public abstract void printareBilet();

    public BiletAbstract(String gazda, String oaspeti, float pret) {
        Gazda = gazda;
        Oaspeti = oaspeti;
        this.pret = pret;
    }

    public String getGazda() {
        return Gazda;
    }

    public void setGazda(String gazda) {
        Gazda = gazda;
    }

    public String getOaspeti() {
        return Oaspeti;
    }

    public void setOaspeti(String oaspeti) {
        Oaspeti = oaspeti;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BIletAbstract{");
        sb.append("Gazda='").append(Gazda).append('\'');
        sb.append(", Oaspeti='").append(Oaspeti).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
