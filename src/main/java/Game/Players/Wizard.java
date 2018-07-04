package Game.Players;


import Game.Abilities.Spell;
import Game.Abilities.Weapon;
import Game.Behaviours.IPlayer;
import Game.Behaviours.ITreasure;

import java.util.ArrayList;

public class Wizard extends SpellCaster implements IPlayer {

    private String name;
    private ArrayList<ITreasure> treasureBag;
    private int healthPoints;
    private int progress;

    public Wizard(String name, ArrayList treasureBag, int healthPoints, int progress, Spell spell) {
        super(name, treasureBag, healthPoints, progress, spell);
    }

}
