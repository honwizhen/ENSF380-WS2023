
package edu.ucalgary.oop;

public class CharacterRogue extends GameCharacter {
    private String[] weapons = new String[2];

    public CharacterRogue(String characterName, int attackPriority) throws IllegalArgumentException {
        super(characterName, "warrior", attackPriority, 20);
        this.weapons[0] = "sword";
    }

    public String getWeapons() {
        String allWeapons = "";
        for (int i=0; i<weapons.length; i++) {
            if (weapons[i] == null) { break; }
            allWeapons = allWeapons + weapons[i] + " and ";
        }
        allWeapons = allWeapons.replaceAll(" and $", "");
        return allWeapons;
    }

    @Override
    public String talk(String message) {
        String returnMsg = message.replaceAll("...(I am " + this.getCharacterName() + " the Rogue.)....";); // ....(I am Aaron Burr the Rogue.)....
        return returnMsg;
    }

    @Override
    public String getAttackMessage() {
        String returnMsg = this.getCharacterName() + " attacks with their " + this.getWeapons() + ".";
        return returnMsg;
    }
}