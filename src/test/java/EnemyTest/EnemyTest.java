package EnemyTest;

import Enemies.Orc;
import Enemies.Troll;
import Weapons.Ax;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Troll troll;
    Sword sword;
    Ax ax;

    @Before
    public void before(){
        orc = new Orc (300);
        troll = new Troll (400);
        sword = new Sword (20);
        ax = new Ax(30);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(300, orc.getHP());
        assertEquals(400, troll.getHP());
    }

    @Test
    public void canTakeDamage(){
        assertEquals(280, orc.takeDamage(20));
        assertEquals(350, troll.takeDamage(50));
    }

    @Test
    public void canTakeDamageFromAWeapon(){
        assertEquals(280, orc.takeDamage(sword.attack()));
        assertEquals(370, troll.takeDamage(ax.attack()));
    }


}
