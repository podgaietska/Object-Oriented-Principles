package oop.edu.ucalgary.project2;

import java.util.*;
abstract class GameCharacter {
    enum CharacterClasses {
        WARRIOR {
            public String asString() {
                return "Warrior";
            }
        },
        HEALER {
            public String asString() {
                return "Healer";
            }
        },
        ROGUE {
            public String asString() {
                return "Rogue";
            }
        };
        public abstract String asString();
    }

    static TreeSet<Integer> attackPriorities = new TreeSet<Integer>();
    protected String characterName;
    protected final CharacterClasses CHARACTER_CLASS;
    protected final int ATTACK_PRIORITY;
    protected final int ATTACK_DAMAGE;
    protected int lifeforce = 100;

    public String getCharacterName() { return this.characterName; }
    public void setCharacterName(String name) { this.characterName = name; }
    public void setLifeforce(int points) { this.lifeforce = points; }
    public int getAttackPriority() { return this.ATTACK_PRIORITY; }
    public int getAttackDamage() { return this.ATTACK_DAMAGE; }
    public int getLifeforce() { return this.lifeforce; }
    public String getCharacterClass() {
        String theEnum = CHARACTER_CLASS.name();
        return CharacterClasses.valueOf(theEnum).asString();
    }

    public abstract String talk(String message);
    public abstract String getAttackMessage();

    private CharacterClasses getValidCharacterClass(String name) {
        name = name.toUpperCase();
        if (name.equals("WARRIOR")) {
            return CharacterClasses.WARRIOR;
        } else if (name.equals("HEALER")) {
            return CharacterClasses.HEALER;
        }
        return CharacterClasses.ROGUE;
    }

    public GameCharacter(String characterName, String characterClass, int attackPriority, int attackDamage) throws IllegalArgumentException {
        this.characterName = characterName;
        this.CHARACTER_CLASS = getValidCharacterClass(characterClass);
        this.validateAndRecordAttackPriority(attackPriority);
        this.ATTACK_PRIORITY = attackPriority;
        this.ATTACK_DAMAGE = attackDamage;
    }

    public void validateAndRecordAttackPriority (int attackPriority) throws IllegalArgumentException {
        if (attackPriorities.contains(attackPriority)) {
            throw new IllegalArgumentException("Attack priority " + attackPriority + " is already in use.");
        }
        attackPriorities.add(attackPriority);
    }
}
