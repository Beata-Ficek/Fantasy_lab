package EnemyTest;

import Enemies.Orc;
import Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Troll troll;

    @Before
    public void before(){
        orc = new Orc (300);
        troll = new Troll (400);
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


}
