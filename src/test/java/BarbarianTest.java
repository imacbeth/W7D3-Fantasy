import Game.Abilities.Weapon;
import Game.Players.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class BarbarianTest {

        Barbarian barbarian;
        Weapon axe;
        Weapon sword;

        @Before
        public void before(){

            axe = new Weapon("axe", 10);
            sword = new Weapon("sword", 20);
            barbarian = new Barbarian("Tony the Ruthless", null, 100, 0, axe);
        }

        @Test
        public void hasName(){
            assertEquals("Tony the Ruthless", barbarian.getName());
        }

        @Test
        public void hasTreasure(){
            assertEquals(0, barbarian.getTreasure().size());
        }

        @Test
        public void hasHealthPoints(){
            assertEquals(100, barbarian.getHealthPoints());
        }

        @Test
        public void hasProgress(){
            assertEquals(0, barbarian.getProgress());
        }

        @Test
        public void canSetWeapon(){
            barbarian.setWeapon(sword);
            assertEquals(sword, barbarian.getWeapon());
        }
}
