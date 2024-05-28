package tests;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import tests.categorii.TesteCuMock;
import tests.categorii.TesteFaraMock;
import tests.dubluri.PersoanaMock;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    IPersoana client = new Persoana("nume","5020889439503");
    PachetTuristic pachet = new PachetTuristic(client,"destinatie",20.0);
    @org.junit.Test
    @Category({TesteFaraMock.class})
    public void testeazaCorectitudineAplicaDiscount() {
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(16.0,pachet.getPret(),.1);
    }

    @org.junit.Test
    @Category({TesteFaraMock.class})
    public void testeazaCorectitudineLimita() {
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(16.0,pachet.getPret(),.1);
    }

    @org.junit.Test
    @Category({TesteCuMock.class})
    public void testeazaCorectitudineMock() {
        PersoanaMock client = new PersoanaMock();
    }

    @org.junit.Test
    @Category({TesteCuMock.class})
    public void testeazaCorectitudine1() {
        PersoanaMock client = new PersoanaMock();
        PachetTuristic pachet = new PachetTuristic(client,"destinatie",20.0);
        client.setVarsta(65);
    }

}