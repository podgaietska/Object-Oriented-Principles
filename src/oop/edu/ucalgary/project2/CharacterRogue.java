package oop.edu.ucalgary.project2;

public class CharacterRogue extends GameCharacter {
    private String weapon = "knife";

    public CharacterRogue(String characterName, int attackPriority) throws IllegalArgumentException {
        super(characterName, "rogue", attackPriority, 10);
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String talk(String message) {
        String warriorMessage = "....(" + message + ")....";
        return warriorMessage;
    }

    @Override
    public String getAttackMessage() {
        String returnMsg = this.getCharacterName() + " attacks with their " + this.getWeapon() + ".";
        return returnMsg;
    }

}
