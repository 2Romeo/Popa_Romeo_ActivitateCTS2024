package decorator.restaurant.pb7.classes;

public abstract class NotaDePlataAbstract {
    float suma;

    public NotaDePlataAbstract(float suma) {
        this.suma = suma;
    }

    public abstract void printeaza();
}
