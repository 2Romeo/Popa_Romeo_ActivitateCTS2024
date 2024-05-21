package clase;

import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PersoanaTest {
    Persoana p1 = new Persoana("ion ionel ionut","512039019283");

    @org.junit.Test
    public void getSexReturnMasculine() {
        assertEquals("M", p1.getSex());
    }

    @org.junit.Test
    public void getSexReturnFeminine() {
        assertEquals("F", p1.getSex());
    }

    @org.junit.Test
    public void checkCNP() {
    }

    @org.junit.Test
    public void getSexReturnLimitaInferioara() {
        assertEquals(p1.getSex(), "M");
    }

    @org.junit.Test
    public void getSexCrossCheck() {
        if(Integer.valueOf(p1.CNP.charAt(0))%2 == 0){
            assertEquals(p1.getSex(), "F");
        }else{
            assertEquals(p1.getSex(), "M");
        }
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        Persoana p2 = new Persoana("p1", "s02304382340");
        p2.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition2() {
        Persoana p2 = new Persoana("p1", "s02304382340");
        p2.getSex();
    }

    @org.junit.Test
    public void getSexOrder() {
        Persoana p2 = new Persoana("p1", "102304382340");
        Persoana p3 = new Persoana("p3", "205431382340");
        assertTrue(Integer.parseInt(p2.getSex()) > 70);
        assertTrue(p2.getSex().compareTo(p3.getSex()) > 0);
    }

    @org.junit.Test
    public void getSexRange() {
        Persoana p2 = new Persoana("p1", "102304382340");
        assertTrue(p2.getSex().equals("M"));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexExistance() {
        Persoana p2 = new Persoana("p1", "102304382340");
        p2.getSex();
    }
}