package Game.Players;

import Game.Behaviours.IWeapon;
import Game.Abilities.Weapon;
import Game.RoomContents.Treasure;

import java.util.ArrayList;

public abstract class Fighter implements IWeapon{

    private String name;
    private ArrayList<Treasure> treasureBag;
    private  int healthPoints;
    private int progress;
    Weapon weapon;

    public Fighter(String name, ArrayList treasureBag, int healthPoints, int progress, Weapon weapon){
        this.name = name;
        this.treasureBag= new ArrayList<>();
        this.healthPoints = healthPoints;
        this.progress = progress;
        this.weapon = weapon;
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void pickUpTreasure(Treasure item){
        this.treasureBag.add(item);
    }
}
