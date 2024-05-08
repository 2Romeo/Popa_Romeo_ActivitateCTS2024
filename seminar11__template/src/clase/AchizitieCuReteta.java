package clase;

public class AchizitieCuReteta extends AchizitieMedicamente{
    private Reteta reteta;

    public AchizitieCuReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void primesteReteta() {
        System.out.println("a fost primita retata cu numarul " + reteta.getNrReteta());
    }

    @Override
    public boolean verificaStoc() {
        for(String medicament: reteta.getListaMedicamente()){
            if(!stocuri.containsKey(medicament)){
                return false;
            }
        }
        return true;
    }

    @Override
    public void aducereMedicamente() {
        System.out.println("au fost aduse medicamente pentru retata cu numarul " + reteta.getNrReteta());
        for(String medicament: reteta.getListaMedicamente()){
            stocuri.get(medicament).equals(stocuri.get(medicament) - 1);
            if(stocuri.get(medicament).equals(0)){
                stocuri.remove(medicament);
            }
            //sau
            //stocuri.replace(medicament, stocuri.get(medicament) - 1);
        }
    }

    @Override
    public void incaseaza() {
        System.out.println("s-a incasat pentru retata cu numarul " + reteta.getNrReteta());
    }

    @Override
    public void emitereBon() {
        System.out.println("s-a emis bon pentru retata cu numarul " + reteta.getNrReteta());
    }

    @Override
    public void respingeAchizitie() {
        System.out.println("a fost respinsa retata cu numarul " + reteta.getNrReteta());
    }
}
