package Players;


import Weapons.IWeapon;

public class Dwarf extends Fighter {


    public Dwarf(String name, int HP, IWeapon weapon) {
        super(name, HP, weapon);
    }

    @Override
    public String  attack() {
        return "I am a dwarf will attack you.";
    }
}
