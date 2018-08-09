package MageTest;

import Players.Warlock;
import Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTests {

    Wizard wizard;
    Warlock warlock;

    @Before
    public void before(){
        wizard = new Wizard( "MagicMike", 100, 40);
        warlock= new Warlock( "TrickyVicky", 120, 50);
    }

    @Test
    public void getName(){
        assertEquals("MagicMike", wizard.getName());
    }

    @Test
    public void getHP(){
        assertEquals(100, wizard.getHP());
    }

    @Test
    public void getDefenceValue(){
        assertEquals(50, warlock.getDefendValue());
    }

    @Test
    public void mageCanDefend(){
        assertEquals("I will defend. You loose: 50", warlock.defend());
    }


}
