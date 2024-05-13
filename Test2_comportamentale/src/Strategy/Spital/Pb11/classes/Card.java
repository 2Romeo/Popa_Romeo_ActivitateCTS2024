package Strategy.Spital.Pb11.classes;

public class Card implements ModPlata{
    @Override
    public void plateste() {
        System.out.println("platit cu cardul");
    }
}
