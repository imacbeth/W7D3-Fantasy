package Game;

import Game.Behaviours.ITreasure;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private ArrayList<ITreasure> treasureBag;
    private int healthPoints;
    private int progress;

    public Player(String name, ArrayList<ITreasure> treasureBag, int healthPoints, int progress){
        name = this.name;
       treasureBag =  new ArrayList<>();
       healthPoints = this.healthPoints;
       progress = this.progress;
    }





}
