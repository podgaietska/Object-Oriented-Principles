package oop.edu.ucalgary.project2;
import java.util.*;

public class PrintHTML implements PrintOutput {
    public void printStats(GameCharacter theCharacter) {
        String characterName = theCharacter.characterName;
        String characterClass = theCharacter.getCharacterClass();
        System.out.println("<p>Name: " + characterName + "</p>");
        System.out.println("<p>Life: " + theCharacter.lifeforce + "</p>");
        System.out.println("<p>Class: " + characterClass + "</p>");
        System.out.println("<p>Says: " + theCharacter.talk("I am " + characterName + " the " + characterClass + ".") + "</p>");
        System.out.println("<p>Attack speed: " + theCharacter.getAttackPriority() + "</p>");
        System.out.println("<p>Damage: " + theCharacter.getAttackDamage() + "</p>");
        System.out.println("<p>Attack: " + theCharacter.getAttackMessage() + "</p>");
    }

    public void printFightLog(ArrayList<String> log) {
        Iterator<String> i = log.iterator();
        while(i.hasNext()) {
            System.out.println("<p>" + i.next() + "</p>");
        }
    }

    public void printMessage(String message) {

        if (message.charAt(message.length() - 1) == '\n') {
            message = message.substring(0, message.length() - 1);
        }

        System.out.println("<p>" + message + "</p>");
    }

}
