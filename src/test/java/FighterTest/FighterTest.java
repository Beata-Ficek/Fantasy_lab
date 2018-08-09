package FighterTest;

import Players.Barbarian;
import Players.Dwarf;
import Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    Barbarian barbarian;
    Knight knight;
    Dwarf dwarf;

    @Before
    public void before() {
    barbarian = new Barbarian ( "Colin", 120);
    knight = new Knight ("Artur", 100);
    dwarf = new Dwarf ("Gimli", 80);
    }

    @Test
    public void HasName(){
        assertEquals("Colin", barbarian.getName());
        assertEquals("Artur", knight.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(80, dwarf.getHP());
        assertEquals(120, barbarian.getHP());
    }

}

