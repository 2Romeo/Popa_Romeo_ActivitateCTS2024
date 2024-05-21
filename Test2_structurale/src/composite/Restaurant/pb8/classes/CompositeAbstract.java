package composite.Restaurant.pb8.classes;

public interface CompositeAbstract {
    public void adauga(CompositeAbstract abs);
    public void sterge(CompositeAbstract abs);
    public CompositeAbstract getInstance(int i);
    public void getDescriere();
}
