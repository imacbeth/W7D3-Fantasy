import Game.Abilities.Spell;
import Game.Players.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Spell thunderbolt;
    Spell hailOfArrows;

    @Before
    public void before() {

        thunderbolt = new Spell("Thunderbolt", 10);
        hailOfArrows = new Spell("Hail of arrows", 20);
        warlock = new Warlock("Saruman the White", null, 100, 0, thunderbolt);
    }

    @Test
    public void hasName() {
        assertEquals("Saruman the White", warlock.getName());
    }

    @Test
    public void hasTreasure() {
        assertEquals(0, warlock.getTreasure().size());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, warlock.getHealthPoints());
    }

    @Test
    public void hasProgress() {
        assertEquals(0, warlock.getProgress());
    }

    @Test
    public void canSetSpell() {
        warlock.setSpell(hailOfArrows);
        assertEquals(hailOfArrows, warlock.getSpell());
    }

}