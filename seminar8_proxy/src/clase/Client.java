package clase;

public class Client implements BiletAbstract{
    private String numeCLient;
    private int varsta;

    public Client(String numeCLient, int varsta) {
        this.numeCLient = numeCLient;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeCLient='").append(numeCLient).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }

    public String getNumeCLient() {
        return numeCLient;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public void vanzareBilet(Client client) {
        System.out.println("client "+ numeCLient + " varsta " + varsta);
    }
}
