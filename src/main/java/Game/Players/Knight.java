package Game.Players;

import Game.Abilities.Weapon;
import Game.Behaviours.IPlayer;
import Game.RoomContents.Treasure;

import java.util.ArrayList;

public class Knight extends Fighter implements IPlayer {

        private String name;
        private ArrayList<Treasure> treasureBag;
        private  int healthPoints;
        private int progress;

        public Knight(String name, ArrayList treasureBag, int healthPoints, int progress, Weapon weapon){
            super(name, treasureBag, healthPoints, progress, weapon);
        }


    }
