package model.hero;

import model.race.RaceEnum;

public class Hero {
    private boolean isLeader;
    private int causingDamage;
    private int health = 100;
    private int mana = 100;
    private int rage;
    private RaceEnum race;

    public Hero(RaceEnum race){
        this.race = race;
    }

}
