package cts.popa.romeo.g1094.composite.main;

import cts.popa.romeo.g1094.composite.model.CompositeAbstract;
import cts.popa.romeo.g1094.composite.model.ObiectivTuristic;
import cts.popa.romeo.g1094.composite.model.Primarie;

public class Program {
    public static void main(String[] args) {
        CompositeAbstract sector1 = new Primarie();
        CompositeAbstract sector2 = new Primarie();
        CompositeAbstract sector3 = new Primarie();
        CompositeAbstract primarieGenerala = new Primarie();
        CompositeAbstract obiectiv1 = new ObiectivTuristic("o1");
        CompositeAbstract obiectiv2 = new ObiectivTuristic("o2");
        CompositeAbstract obiectiv3 = new ObiectivTuristic("o3");

        sector1.adauga(obiectiv1);
        sector2.adauga(obiectiv2);
        sector3.adauga(obiectiv3);

        primarieGenerala.adauga(sector1);
        primarieGenerala.adauga(sector2);
        primarieGenerala.adauga(sector3);

        primarieGenerala.getDescriere();

    }
}
