package Game.Players;

import Game.Abilities.HealingTool;
import Game.Abilities.Weapon;
import Game.Behaviours.IPlayer;
import Game.Behaviours.ITreasure;

import java.util.ArrayList;

public class Cleric extends Healer implements IPlayer {

    private String name;
    private ArrayList<ITreasure> treasureBag;
    private  int healthPoints;
    private int progress;

    public Cleric(String name, ArrayList treasureBag, int healthPoints, int progress, HealingTool healingTool){
        super(name, treasureBag, healthPoints, progress, healingTool);
    }



}
