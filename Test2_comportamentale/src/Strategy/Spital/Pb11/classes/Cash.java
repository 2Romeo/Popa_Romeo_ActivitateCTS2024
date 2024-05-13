package Strategy.Spital.Pb11.classes;

public class Cash implements ModPlata{
    @Override
    public void plateste() {
        System.out.println("platit cash");
    }
}
