package model.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.race.Race;

@AllArgsConstructor
public class Team {

    @Getter @Setter
    private String name;
    Race character1;
    Race character2;
    Race character3;
}
