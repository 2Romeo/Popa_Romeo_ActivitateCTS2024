package Observer.Spital.pb12.clase;

public class VirusObserver extends Observabil{
    @Override
    public void abonare(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dezavonare(Observer observer) {
        observers.remove(observer);
    }
}
