package Adapter.Spital.Pb5.clase.Adapter;

import Adapter.Spital.Pb5.clase.Adaptee.MedicamentSpital;

public abstract class AdapterClasaExistenta {
    private MedicamentSpital medicamentSpital;

    public AdapterClasaExistenta() {
        this.medicamentSpital = new MedicamentSpital();
    }

    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
