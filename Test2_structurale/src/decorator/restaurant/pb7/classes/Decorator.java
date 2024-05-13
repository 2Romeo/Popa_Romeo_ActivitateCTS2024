package decorator.restaurant.pb7.classes;

public abstract class Decorator extends NotaDePlataAbstract{

    NotaDePlataAbstract notaDePlata;

    public Decorator(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata.suma);
        this.notaDePlata = notaDePlata;
    }

    public NotaDePlataAbstract getNotaDePlata() {
        return notaDePlata;
    }
}
