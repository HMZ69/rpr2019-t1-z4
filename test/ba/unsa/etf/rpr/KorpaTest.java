package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KorpaTest {

    @Test
    void testKorpaVanOpsega () {
        Korpa k = new Korpa();
        for (int i = 0; i < 50; i++) {
            k.getArtikli()[i] = new Artikl("a", 1, "2");
        }
        assertFalse(k.dodajArtikl(new Artikl("b", 2, "3")));
    }

    @Test
    void testIzbaciArtikl () {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("a", 2, "1"));
        assertEquals(new Artikl("a",2, "1"), k.izbaciArtiklSaKodom("1"));
    }

    @Test
    void testDodajArtikl () {
        Korpa k = new Korpa();
        for (int i = 0; i < 15; i++) {
            k.getArtikli()[i] = new Artikl("a", 1, "2");
        }
        assertTrue(k.dodajArtikl(new Artikl("b", 3, "1")));
    }
}
