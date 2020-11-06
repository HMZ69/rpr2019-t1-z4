package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SupermarketTest {

    @Test
    void testDodajArtikl() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("a", 1, "1"));
        assertEquals(s.getArtikli()[0], new Artikl("a", 1, "1"));
    }

    @Test
    void testGetArtikli() {
        Artikl[] artikli = new Artikl[1000];
        Supermarket s = new Supermarket();
        assertArrayEquals(artikli, s.getArtikli());
    }

    @Test
    void testIzbaciArtiklSaKodom() {

    }

}
