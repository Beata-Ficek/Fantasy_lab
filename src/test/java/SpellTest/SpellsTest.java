package SpellTest;

import Spells.Abracadabra;
import Spells.HokusPokus;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpellsTest {

    HokusPokus hokuspokus;
    Abracadabra abracadabra;

    @Before
    public void before(){
        hokuspokus = new HokusPokus(10);
        abracadabra = new Abracadabra(15);
    }

    @Test
    public void hasPowerValue() {
        assertEquals(10, hokuspokus.getPowerValue());
        assertEquals(15, abracadabra.getPowerValue());
    }

    @Test
    public void canCast(){
        assertEquals("HokusPokus CzaryMary, you loose :10", hokuspokus.cast());
    }
}

