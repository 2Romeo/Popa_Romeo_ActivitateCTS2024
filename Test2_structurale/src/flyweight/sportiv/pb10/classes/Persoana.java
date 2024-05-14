package flyweight.sportiv.pb10.classes;

public class Persoana {
    float inaltime;
    float latime;

    int culoare;

    public Persoana(float inaltime, float latime, int culoare) {
        this.inaltime = inaltime;
        this.latime = latime;
        this.culoare = culoare;
    }

    public float getInaltime() {
        return inaltime;
    }

    public float getLatime() {
        return latime;
    }

    public int getCuloare() {
        return culoare;
    }
}
