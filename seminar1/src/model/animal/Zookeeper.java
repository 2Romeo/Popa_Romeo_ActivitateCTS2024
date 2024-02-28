package model.animal;

public class Zookeeper {
    private String nume;

    public Zookeeper(String nume) {
        this.nume = nume;
    }

    public void hranesteMamifer(Animal animal, String mancare) {
        animal.eat(mancare);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
