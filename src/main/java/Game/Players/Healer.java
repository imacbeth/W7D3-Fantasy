package Game.Players;

import Game.Abilities.HealingTool;
import Game.Abilities.HealingTool;
import Game.Abilities.Weapon;
import Game.Behaviours.IHealingTool;
import Game.Behaviours.ITreasure;
import Game.Abilities.HealingTool;

import java.util.ArrayList;

public abstract class Healer implements IHealingTool{
        private String name;
        private ArrayList<ITreasure> treasureBag;
        private  int healthPoints;
        private int progress;
        HealingTool healingTool;

    public Healer(String name, ArrayList treasureBag, int healthPoints, int progress, HealingTool healingTool){
        this.name = name;
        this.treasureBag= new ArrayList<>();
        this.healthPoints = healthPoints;
        this.progress = progress;
        this.healingTool = healingTool;
    }

        public String getName(){
        return this.name;
    }

        public ArrayList getTreasure(){
        return this.treasureBag;
    }

        public int getHealthPoints(){
        return this.healthPoints;
    }

        public int getProgress(){
        return this.progress;
    }
    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool){
        this.healingTool = healingTool;
    }

}
