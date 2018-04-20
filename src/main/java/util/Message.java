package util;

public class Message {
    private Message(){}

    public static void welcomeMessage(){
        System.out.println("hello. today we gonna make new game. so, let's do it ");
    }


    public static void showUserChoiceToConsole(String inputString){
        System.out.println("You chose: "+inputString);
    }

}
