import Game.Behaviours.IWeapon;
import Game.Abilities.Weapon;
import Game.Players.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Weapon axe;
    Weapon sword;

    @Before
    public void before(){

        axe = new Weapon("axe", 10);
        sword = new Weapon("sword", 20);
        dwarf = new Dwarf("Zsolt the Incorrigible", null, 100, 0, axe);
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt the Incorrigible", dwarf.getName());
    }

    @Test
    public void hasTreasure(){
        assertEquals(0, dwarf.getTreasure().size());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void hasProgress(){
        assertEquals(0, dwarf.getProgress());
    }

    @Test
    public void canSetWeapon(){
        dwarf.setWeapon(sword);
        assertEquals(sword, dwarf.getWeapon());
    }

}
