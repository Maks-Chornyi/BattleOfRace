package util;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import model.race.Elf;
import model.race.Human;
import model.race.Race;
import model.race.Unit;
import util.Message;

import java.util.Scanner;

public class InteractionWithUser {
    private static Scanner sc;
    private static String userInput;

    //get or create and get new scanner (singletone)
    public static Scanner getScanner(){
        if(sc==null)
            sc = new Scanner(System.in);
        return sc;
    }


    //getting name of the future team and print it to console
    public String getTeamName(){
            Message.welcomeMessage();
            System.out.println("Choose name of your future team, please");
            userInput = getScanner().nextLine();
            Message.showUserChoiceToConsole(userInput);
            return userInput;
    }


    //getting character of future team
    public Race getNewCharacter(){
        Unit unit1;
        System.out.println("Choose race (by number) for your future character: 1[ELF] 2[HUMAN]");
        userInput = getScanner().next();
        if(userInput=="1")
            unit1 = new Elf();
        else
            unit1 = new Human();
        return unit1;
    }


}
