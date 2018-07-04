import Game.Abilities.Weapon;
import Game.Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

        Knight knight;
        Weapon lance;
        Weapon sword;

        @Before
        public void before(){

            lance = new Weapon("lance", 10);
            sword = new Weapon("sword", 20);
            knight = new Knight("Lancelot the Brave", null, 100, 0, lance);
        }

        @Test
        public void hasName(){
            assertEquals("Lancelot the Brave", knight.getName());
        }

        @Test
        public void hasTreasure(){
            assertEquals(0, knight.getTreasure().size());
        }

        @Test
        public void hasHealthPoints(){
            assertEquals(100, knight.getHealthPoints());
        }

        @Test
        public void hasProgress(){
            assertEquals(0, knight.getProgress());
        }

        @Test
        public void canSetWeapon(){
            knight.setWeapon(sword);
            assertEquals(sword, knight.getWeapon());
        }
}
