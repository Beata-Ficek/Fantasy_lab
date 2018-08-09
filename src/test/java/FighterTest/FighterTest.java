package FighterTest;

import Players.Barbarian;
import Players.Dwarf;
import Players.Knight;
import Weapons.Ax;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    Barbarian barbarian;
    Knight knight;
    Dwarf dwarf;
    Sword sword;
    Ax ax;


    @Before
    public void before() {
    barbarian = new Barbarian ( "Colin", 120, ax);
    knight = new Knight ("Artur", 100, sword);
    dwarf = new Dwarf ("Gimli", 80, ax);

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

    @Test
    public void hasWeapon(){
        assertEquals(sword, knight.getWeapon());
        assertEquals(ax, dwarf.getWeapon());
    }

}

