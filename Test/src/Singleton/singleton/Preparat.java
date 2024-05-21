package Singleton.singleton;

public class Preparat {
    private float timp;
    private double temp;

    public Preparat(float timp, double temp) {
        this.timp = timp;
        this.temp = temp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Preparat ");
        sb.append("timp=").append(timp);
        sb.append(", temp=").append(temp);
        return sb.toString();
    }

    public float getTimp() {
        return timp;
    }

    public void setTimp(float timp) {
        this.timp = timp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
