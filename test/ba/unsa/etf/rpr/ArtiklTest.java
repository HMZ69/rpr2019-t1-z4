package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtiklTest {

    @Test
    void testGetNazivArtikla () {
        Artikl a = new Artikl("Upaljac", 2, "1");
        assertEquals(a.getNaziv(), "Upaljac");
    }

    @Test
    void testGetNazivArtiklaNoName () {
        Artikl a = new Artikl ("", 3, "1");
        assertEquals("", a.getNaziv());
    }

    @Test
    void testGetCijena () {
        Artikl a = new Artikl ("Predmet", 2, "1");
        assertEquals(2, a.getCijena());
    }

}
