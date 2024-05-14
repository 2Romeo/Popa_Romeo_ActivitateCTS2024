package Adapter.Banca.pb5.classes.Adapter;

import Adapter.Banca.pb5.classes.Adaptee.CrediteLeasing;

public class Adapter implements FrameworkVechi {
    CrediteLeasing leasing;

    public Adapter(CrediteLeasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void oferaleasing() {
        System.out.println("ofera leasing vechi");
        leasing.oferaleasing();
    }
}
