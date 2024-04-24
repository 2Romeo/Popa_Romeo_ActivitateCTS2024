package clase;

public class Cash extends ModPlata {
    int sold;

    public Cash(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int suma, String nume) {
        if(sold >= suma){
            System.out.println(nume + " are de platit cash " + suma);
            sold -= suma;
        }else{
            succesor.plateste(suma,nume); // chain of command
        }
    }
}
