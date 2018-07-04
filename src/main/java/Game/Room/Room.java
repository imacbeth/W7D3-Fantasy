package Game.Room;

import Game.Behaviours.IEnemy;
import Game.Behaviours.IPlayer;
import Game.RoomContents.Treasure;
import Game.Players.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {

    private ArrayList<IPlayer> players;
    private Treasure treasure;
    private ArrayList<IEnemy> enemies;
    private Fighter fighter;
    private SpellCaster spellCaster;
    private Healer healer;


    public Room(ArrayList players, Treasure treasure, ArrayList enemies){
        this.players = new ArrayList<>();
        this.treasure = treasure;
        this.enemies = new ArrayList<>();
    }

    public int countPlayers(){
        return this.players.size();
    }


    public int countEnemies(){
        return this.enemies.size();
    }

    public Treasure getTreasure(){
        return this.treasure;
    }

    public int getPlayerIndex(IPlayer player){
        return this.players.indexOf(player);
    }


    public void giveTreasureToPlayer(Treasure item, IPlayer player){
            player.pickUpTreasure(item);

    }
}
