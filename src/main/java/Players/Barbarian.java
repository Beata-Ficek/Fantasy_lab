package Players;

import Weapons.IWeapon;

public class Barbarian extends Fighter{

    public Barbarian(String name, int HP, IWeapon weapon) {
        super(name, HP, weapon);
    }

    @Override
    public String attack() {
        return "I am a Barbarian will attack you.";
    }
}
