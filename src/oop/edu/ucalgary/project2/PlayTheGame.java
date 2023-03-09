package oop.edu.ucalgary.project2;
import java.util.*;

public class PlayTheGame {
    public static void main(String[] args) throws IllegalArgumentException, SingleUseMethodException {

        PrintPlainText print = new PrintPlainText();

        print.printMessage("Meet our characters.\n");

        var char1 = new CharacterWarrior("Katniss", 110, "bow", "knife");
        print.printStats(char1);
        System.out.println("");

        var char2 = new CharacterWarrior("Xena", 92, "short sword");
        print.printStats(char2);
        System.out.println("");

        var char4 = new CharacterRogue("Alexander Hamilton", 90);
        print.printStats(char4);
        System.out.println("");

        var char5 = new CharacterRogue("Aaron Burr", 91);
        print.printStats(char5);
        System.out.println("");

        System.out.println("Starting a duel between Alexander Hamilton and Aaron Burr.");
        var combat = new Duel(char4, char5);
        ArrayList<String> outcome = combat.fightAndReturnLog();
        print.printFightLog(outcome);
    }


}
