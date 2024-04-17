package Restaurant.pb4.Prototype;

public class Rezervare extends AbstractPrototype{
    @Override
    public AbstractPrototype cloneaza() {
        return new Rezervare(); // deep copy implementation
    }
}
