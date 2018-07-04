package Game.Players;

import Game.Abilities.HealingTool;
import Game.Behaviours.IPlayer;
import Game.RoomContents.Treasure;

import java.util.ArrayList;

public class Cleric extends Healer implements IPlayer {

    private String name;
    private ArrayList<Treasure> treasureBag;
    private  int healthPoints;
    private int progress;

    public Cleric(String name, ArrayList treasureBag, int healthPoints, int progress, HealingTool healingTool){
        super(name, treasureBag, healthPoints, progress, healingTool);
    }



}
