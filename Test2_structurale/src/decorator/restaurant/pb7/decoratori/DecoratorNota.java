package decorator.restaurant.pb7.decoratori;

import decorator.restaurant.pb7.classes.Decorator;
import decorator.restaurant.pb7.classes.NotaDePlataAbstract;

public class DecoratorNota extends Decorator {
    public DecoratorNota(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeaza() {
        getNotaDePlata().printeaza();
        System.out.println("La multi ani");
    }
}
