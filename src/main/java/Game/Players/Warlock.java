package Game.Players;

import Game.Abilities.Spell;
import Game.Behaviours.IPlayer;
import Game.RoomContents.Treasure;

import java.util.ArrayList;

public class Warlock extends SpellCaster implements IPlayer {

    private String name;
    private ArrayList<Treasure> treasureBag;
    private int healthPoints;
    private int progress;

    public Warlock(String name, ArrayList treasureBag, int healthPoints, int progress, Spell spell) {
        super(name, treasureBag, healthPoints, progress, spell);
    }
}
