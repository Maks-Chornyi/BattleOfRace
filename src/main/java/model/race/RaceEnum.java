package model.race;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public enum RaceEnum {
    ELF(15,10,25,22,18),
    HUMAN(10,30,20,15,15);

    @Getter
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;

}
