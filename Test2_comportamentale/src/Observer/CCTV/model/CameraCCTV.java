package Observer.CCTV.model;

import java.util.ArrayList;
import java.util.List;

public interface CameraCCTV { //observabil
    List<Observer> observeri = new ArrayList<>();
    public void adauga(Observer abs);
    public void sterge(Observer abs);
    public void notificaAngajati(String mesaj);
}
