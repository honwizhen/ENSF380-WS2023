class CharacterRogue extends GameCharacter {
    private String weapon = new String();
    public CharacterRogue(String characterName, int attackPriority) throws IllegalArgumentException {
        super(characterName, "rogue", attackPriority, 10);
        this.weapon = "knife";
    }
    public String getWeapon() {
        return this.weapon;
    }

    @Override
    public String getAttackMessage() {
        String returnMsg = this.getCharacterName() + " attacks with their " + this.getWeapons() + ".";
        return returnMsg;
    }

    @Override
    public String talk(String message) {
        return "....(" + message + ")....";
    }

}