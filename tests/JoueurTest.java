package tests;

import jeu.Carte;
import jeu.Joueur;
import org.junit.Test;

import static org.junit.Assert.*;

public class JoueurTest {
    @Test
    public void JoueurTest(){
        // test constructeur
        Joueur j = new Joueur("tests", 0);
    }
    @Test
    public void prendreCarteTest(){
        // test ajout de carte
        Joueur j = new Joueur("tests", 0);
        j.prendreCarte(new Carte(3));
        //test comparaison carte
        assertTrue(j.estDansPioche(3));
    }
    @Test
    public void trierDeckTest(){
        // test tri de cartes
        Joueur j = new Joueur("tests", 0);
        j.prendreCarte(new Carte(3));
        j.prendreCarte(new Carte(2));
        j.trierDeck();
        assertEquals(j.getDeck().get(0).getNum(), 2);
    }
    @Test
    public void jposerCarteTest(){
        // test poser une carte
        Joueur j = new Joueur("tests", 0);
        j.prendreCarte(new Carte(3));
        j.jposerCarte(3);
        assertTrue(j.getDeck().isEmpty());
    }
}