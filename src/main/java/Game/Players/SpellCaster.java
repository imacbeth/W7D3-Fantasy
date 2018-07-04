package Game.Players;

import Game.Abilities.Spell;
import Game.Behaviours.ISpell;
import Game.RoomContents.Treasure;

import java.util.ArrayList;

public abstract class SpellCaster implements ISpell {

    private String name;
    private ArrayList<Treasure> treasureBag;
    private int healthPoints;
    private int progress;
    Spell spell;

    public SpellCaster(String name, ArrayList treasureBag, int healthPoints, int progress, Spell spell) {
        this.name = name;
        this.treasureBag = new ArrayList<>();
        this.healthPoints = healthPoints;
        this.progress = progress;
        this.spell = spell;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList getTreasure() {
        return this.treasureBag;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getProgress() {
        return this.progress;
    }

    public Spell getSpell() {
        return spell;
    }


    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void pickUpTreasure(Treasure item){
        this.treasureBag.add(item);
    }
}
