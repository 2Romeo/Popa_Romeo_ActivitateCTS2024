package composite.Spital.pb8.main;

import composite.Spital.pb8.classes.CompositeAbstract;
import composite.Spital.pb8.classes.Departament;
import composite.Spital.pb8.classes.Sectie;

public class Main {
    public static void main(String[] args) {
        CompositeAbstract departament = new Departament("depart1");
        CompositeAbstract sectie = new Sectie("sectie 1");
        CompositeAbstract sectie2 = new Sectie("sectie 2");
        departament.adauga(sectie);
        departament.adauga(sectie2);
        departament.GetDescriere();
        departament.sterge(sectie2);
        departament.GetDescriere();
    }
}