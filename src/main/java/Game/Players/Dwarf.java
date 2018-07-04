package Game.Players;

import Game.Behaviours.ITreasure;
import Game.Behaviours.IPlayer;

import java.util.ArrayList;

public class Dwarf implements IPlayer{

       private String name;
       private ArrayList<ITreasure> treasureBag;
       private  int healthPoints;
       private int progress;

    public Dwarf(String name, ArrayList treasureBag, int healthPoints, int progress){
       this.name = name;
       this.treasureBag= new ArrayList<>();
       this.healthPoints = healthPoints;
       this.progress = progress;

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
}
