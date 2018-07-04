import Game.Abilities.HealingTool;
import Game.Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingTool antibiotics;
    HealingTool aspirin;

    @Before
    public void before() {

        antibiotics = new HealingTool("antibiotics", 10);
        aspirin = new HealingTool("aspirin", 20);
        cleric = new Cleric("Dr Fantastic", null, 100, 0, antibiotics);
    }

    @Test
    public void hasName() {
        assertEquals("Dr Fantastic", cleric.getName());
    }

    @Test
    public void hasTreasure() {
        assertEquals(0, cleric.getTreasure().size());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void hasProgress() {
        assertEquals(0, cleric.getProgress());
    }

    @Test
    public void canSetHealingTool() {
        cleric.setHealingTool(aspirin);
        assertEquals(aspirin, cleric.getHealingTool());
    }
}