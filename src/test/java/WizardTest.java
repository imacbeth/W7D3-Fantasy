import Game.Abilities.Spell;
import Game.Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell thunderbolt;
    Spell hailOfArrows;

    @Before
    public void before() {

        thunderbolt = new Spell("Thunderbolt", 10);
        hailOfArrows = new Spell("Hail of arrows", 20);
        wizard = new Wizard("Gandalf the Grey", null, 100, 0, thunderbolt);
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf the Grey", wizard.getName());
    }

    @Test
    public void hasTreasure() {
        assertEquals(0, wizard.getTreasure().size());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void hasProgress() {
        assertEquals(0, wizard.getProgress());
    }

    @Test
    public void canSetSpell() {
        wizard.setSpell(hailOfArrows);
        assertEquals(hailOfArrows, wizard.getSpell());
    }

}
