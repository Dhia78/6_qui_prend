package tests;

import jeu.Carte;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class CarteTest {
    @Test
    public void toStringTest(){
        // test tetes de boeufs
        for (int i = 1; i < 105; ++i) {System.out.println(new Carte(i));}
    }
    @Test
    public void compareToTest(){
        // test tri
        ArrayList<Carte> l = new ArrayList<>();
        l.add(new Carte(55));
        l.add(new Carte(25));
        l.sort(Carte::compareTo);
        assertTrue(l.get(0).getNum() == 25 && l.get(1).getNum() == 55);
    }
    @Test
    public void CarteTest(){
        // test tetes de boeuf
        assertEquals(2, new Carte(25).getTete());
        assertEquals(7, new Carte(55).getTete());
    }
}