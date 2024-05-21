package Observer.Sportiv.pb12.classes.Observabil;
import Observer.Sportiv.pb12.classes.Observers.Observer;

public class Meci extends Observabil{

    @Override
    public void adaugaObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observerList.remove(observer);
    }
}
