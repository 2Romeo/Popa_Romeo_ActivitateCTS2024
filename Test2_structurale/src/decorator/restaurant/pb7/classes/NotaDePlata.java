package decorator.restaurant.pb7.classes;

public class NotaDePlata extends NotaDePlataAbstract{
    public NotaDePlata(float suma) {
        super(suma);
    }

    @Override
    public void printeaza() {
        System.out.println("nota de plata este " +suma);
    }
}
