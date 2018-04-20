package model.team;

import util.InteractionWithUser;
import model.race.Race;

public class TeamCreator {
    private String name;
    private Race character1;
    private Race character2;
    private Race character3;

    InteractionWithUser interaction = new InteractionWithUser();

    public void createTeam(){
        this.name = interaction.getTeamName();
        this.character1 = interaction.getNewCharacter();
        this.character2 = interaction.getNewCharacter();
        this.character3 = interaction.getNewCharacter();
        new Team(name,character1,character2,character3);
    }
}
