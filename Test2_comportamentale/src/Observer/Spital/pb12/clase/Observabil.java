package Observer.Spital.pb12.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil{
    List<Observer> observers = new ArrayList<>();

    public abstract void abonare(Observer observer);
    public abstract void dezavonare(Observer observer);
    public void notificareObserveri(String mesaj){
        for(Observer observer:observers){
            observer.primesteNotificare(mesaj);
        }
    }
}
