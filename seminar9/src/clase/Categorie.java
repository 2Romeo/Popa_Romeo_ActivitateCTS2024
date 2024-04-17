package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraAbstracta{
    private List<StructuraAbstracta> medicamente = new ArrayList<>();
    private String denumire;

    public Categorie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugareCategorie(StructuraAbstracta structaAbs) {
        this.medicamente.add(structaAbs);
    }

    @Override
    public void stergereCategorie(StructuraAbstracta structaAbs) {
        this.medicamente.remove(structaAbs);
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        if(index >= 0 && index < this.medicamente.size()){
            return this.medicamente.get(index);
        }
        return null;
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println(indentare + "Categorie" + this.denumire + "are urmatoarele subcategorii" );
        this.medicamente.forEach( x -> x.afisareProspect(indentare + "         "));
    }
    public void calculeazaPret(Double procent){
        for(StructuraAbstracta sa: medicamente){
            sa.calculeazaPret(procent);
        }
    }
    public String getDenumire() {
        return denumire;
    }

}
