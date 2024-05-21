package flyweight.sportiv.pb10.classes;

public class Tribuna implements Flyweight{
    String nume;

    public Tribuna(String nume) {
        this.nume = nume;
    }

    @Override
    public void Desenare(Persoana persoana) {
        System.out.println("desenam persoana cu culoarea " + persoana.getCuloare() + " inaltimea " + persoana.getInaltime());
    }
}
