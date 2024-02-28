package zoo;

import model.animal.Animal;
import model.animal.Zookeeper;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String nume;
    private Zookeeper ingrijitor;
    private Map<Animal, String> animale;

    public enum Tip{
        LEU,
        MAIMUTA,
        ZEBRA
    }
    public Zoo(String nume, Zookeeper ingrijitor, Map<Animal, String> animale) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.animale = animale;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Zookeeper getIngrijitor() {
        return ingrijitor;
    }

    public void setIngrijitor(Zookeeper ingrijitor) {
        this.ingrijitor = ingrijitor;
    }

    public Map<Animal, String> getAnimale() {
        return animale;
    }

    public void setAnimale(Map<Animal, String> animale) {
        this.animale = animale;
    }

    public void adaugaAnimal(Animal animal, String mancare){
        if(animale == null){
            animale = new HashMap<Animal,String>();
        }

        if(animal != null ){
            animale.put(animal,mancare);
        }
    }
    public void hranesteAnimalele(){
        for(Animal animal : animale.keySet()){
            ingrijitor.hranesteMamifer(animal,animale.get(animal));
        }
    }
}
