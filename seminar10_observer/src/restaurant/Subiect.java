package restaurant;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect { // subiect observabil
    List<Observer> listaObserveri;

    Subiect(){
        listaObserveri = new ArrayList<>();
    }

    public void adaugaClient(Observer observer){
        listaObserveri.add(observer);
    }

    public void stergeClient(Observer observer){
        listaObserveri.remove(observer);
    }

    protected void notificaObservatori(String mesaj){
        for(Observer observer:listaObserveri){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificareMeniuNou();
    public abstract void notificareSchimbareMeniu();
    public abstract void notificareEveniment(String data);
}
