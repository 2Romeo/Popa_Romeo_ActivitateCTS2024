package tests.dubluri;

import clase.IPersoana;

public class PersoanaMock implements IPersoana {

    private String checkSEX;
    private boolean checkCNP;
    private int varsta;

    public PersoanaMock(){
    }


    @Override
    public String getSex() {
        return checkSEX;
    }

    @Override
    public int getVarsta() {
        return 0;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }

    public void setCheckSEX(String checkSEX) {
        this.checkSEX = checkSEX;
    }

    public void setCheckCNP(boolean checkCNP) {
        this.checkCNP = checkCNP;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
