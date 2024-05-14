package Strategy.Agentie.strategy.model;

public class Client {
    ModInsusire modInsusire;

    public Client(ModInsusire modInsusire) {
        this.modInsusire = modInsusire;
    }

    public void insusire(){
        modInsusire.achizitioneaza();
    }
    public void setModInsusire(ModInsusire modInsusire) {
        this.modInsusire = modInsusire;
    }
}
