import Game.Abilities.Spell;
import Game.Behaviours.IEnemy;
import Game.Behaviours.IPlayer;
import Game.Players.Fighter;
import Game.Players.Healer;
import Game.Players.SpellCaster;
import Game.Players.Wizard;
import Game.Room.Room;
import Game.RoomContents.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Treasure treasure;
    Treasure treasure2;
    ArrayList<IEnemy> enemies;
    Fighter fighter;
    SpellCaster spellCaster;
    Healer healer;
    Wizard wizard;
    Spell thunderbolt;
    Spell hailOfArrows;
    ArrayList<IPlayer> players;

    @Before
    public void before(){
        treasure = new Treasure("Gold");
        treasure2 = new Treasure("Silver locket");
        thunderbolt = new Spell("Thunderbolt", 10);
        hailOfArrows = new Spell("Hail of arrows", 20);
        wizard = new Wizard("Gandalf the Grey", null, 100, 0, thunderbolt);
        players = new ArrayList<>();
        players.add(wizard);
        enemies = new ArrayList<>();
        room = new Room(players, treasure, enemies);
    }

    @Test
    public void canGiveTreasureToPlayers(){
        room.giveTreasureToPlayer(treasure, wizard);
        room.giveTreasureToPlayer(treasure2, wizard);
        assertEquals(2, wizard.getTreasure().size());
    }


}
