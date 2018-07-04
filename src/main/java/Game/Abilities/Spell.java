package Game.Abilities;

public class Spell {

    String type;
    int damagePerHit;

    public Spell(String type, int damagePerHit){
        this.type = type;
        this.damagePerHit = damagePerHit;
    }

    public int getDamagePerHit(){
        return this.damagePerHit;
    }
}
