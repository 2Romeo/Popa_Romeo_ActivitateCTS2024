package clase;

public class Card extends ModPlata {
    private int sold;

    public Card(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int suma, String nume) {
        if(suma <= sold){
            System.out.println(nume + " are de platit cu cardul "+ suma);
            sold -= suma;
        }else{
            succesor.plateste(suma,nume); // chain of command
        }
    }
}
