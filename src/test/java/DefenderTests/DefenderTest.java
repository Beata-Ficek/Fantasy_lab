package DefenderTests;

import Defenders.Dragon;
import Defenders.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefenderTest {

    Dragon dragon;
    Ogre ogre;

    @Before
    public void before(){
        dragon = new Dragon( 24);
        ogre = new Ogre(13);
    }

    @Test
    public void hasDefendValue() {
        assertEquals(24, dragon.getDefendValue());
        assertEquals(13, ogre.getDefendValue());
    }

    @Test
    public void canDefend(){
        assertEquals("I can EAT you, you loose 13 health points", ogre.defend());
    }
}
