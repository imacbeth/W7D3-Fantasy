package Game.Abilities;

public class HealingTool {

    String type;
    int healthPointsRestoredPerUse;

    public HealingTool(String type, int healthPointsRestoredPerUse){
        this.type = type;
        this.healthPointsRestoredPerUse = healthPointsRestoredPerUse;
    }

    public int getHealthPointsRestoredPerUse(){
        return this.healthPointsRestoredPerUse;
    }
}
