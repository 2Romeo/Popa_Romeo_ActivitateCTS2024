package clase;

public class ProxyBilet implements BiletAbstract{
    private BiletAbstract bilet;
    private static int varstaMin = 14;

    public ProxyBilet(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public static void setVarstaMin(int varstaMin) {
        ProxyBilet.varstaMin = varstaMin;
    }

    @Override
    public void vanzareBilet(Client client) {
        if(client.getVarsta() >varstaMin){
            bilet.vanzareBilet(client);
        }else{
            System.out.println("nu ai voie");
        }

    }
}
