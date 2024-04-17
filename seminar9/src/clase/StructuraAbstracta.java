package clase;

public interface StructuraAbstracta {
    public void adaugareCategorie(StructuraAbstracta structaAbs);
    public void stergereCategorie(StructuraAbstracta structaAbs);
    public StructuraAbstracta getCategorie(int index);
    public void afisareProspect(String indentare);
    public void calculeazaPret(Double procent);

}
