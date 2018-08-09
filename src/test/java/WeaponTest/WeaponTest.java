package WeaponTest;

import Weapons.Ax;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Sword sword;
    Ax ax;

    @Before
    public void before(){
        ax = new Ax(30);
        sword = new Sword (15);
    }

    @Test
    public void canGetDamageValue(){
        assertEquals(30, ax.getDamageValue());
        assertEquals(15, sword.getDamageValue());
    }
}
