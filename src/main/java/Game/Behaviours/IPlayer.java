package Game.Behaviours;

import Game.RoomContents.Treasure;

import java.util.ArrayList;

public interface IPlayer {

     String getName();
     ArrayList getTreasure();
     int getHealthPoints();
     int getProgress();
     void pickUpTreasure(Treasure item);


    }




