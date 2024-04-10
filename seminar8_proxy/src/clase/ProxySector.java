package clase;

import java.util.ArrayList;
import java.util.List;

public class ProxySector implements  BiletAbstract{

    private static List<Character> listaLitere = new ArrayList<>();

    private BiletAbstract bilet;

    public ProxySector(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public static void adaugaLitere(Character character){
        listaLitere.add(character);
    }
    @Override
    public void vanzareBilet(Client client) {
        if(listaLitere.contains(client.getNumeCLient().charAt(0))){
            bilet.vanzareBilet(client);
        }else{
            System.out.println("sector nepotrivit");
        }
    }
}
