package oop.edu.ucalgary.project2;
import java.util.*;

interface PrintOutput {

    public void printStats(GameCharacter theCharacter);

    public void printFightLog(ArrayList<String> log);

    public void printMessage(String message);
}
