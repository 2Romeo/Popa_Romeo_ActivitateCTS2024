package clase;

public abstract class ModPlata {
    protected ModPlata succesor;
    public abstract void plateste(int suma, String nume);

    public void setSuccesor(ModPlata succesor) {
        this.succesor = succesor;
    }
}
