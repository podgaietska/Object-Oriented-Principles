package oop.edu.ucalgary.project1;

import java.util.regex.*;
public class RewardsProfile {
    private String rewardsNum;
    private int points;

    public RewardsProfile(){
        this.rewardsNum = "Not enrolled";
        this.points = 10;
    }

    public RewardsProfile(String newNumber) throws InvalidRewardsNumException{
        Pattern specialChar = Pattern.compile("[^a-z0-9]");
        Matcher hasSpecialChar = specialChar.matcher(newNumber);
        if (hasSpecialChar.find())
            throw new InvalidRewardsNumException();
        this.rewardsNum = newNumber;
        this.points = 10;
    }

    public void setPoints(int addPoints){
        this.points = addPoints;
    }

    public int getPoints(){
        return this.points;
    }

    public String getNumber(){
        return this.rewardsNum;
    }
}
