package Observer.Sportiv.pb12.classes.Observabil;
import Observer.Sportiv.pb12.classes.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    List<Observer> observerList = new ArrayList<>();
    public abstract void adaugaObserver(Observer observer);
    public abstract void stergeObserver(Observer observer);

    public void notificaClienti(String mesaj){
        for(Observer observer : observerList){
            observer.primesteNotif(mesaj);
        }
    }
}
