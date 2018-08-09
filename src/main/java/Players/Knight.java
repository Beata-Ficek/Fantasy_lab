package Players;

import Weapons.IWeapon;

public class Knight extends Fighter{

    public Knight(String name, int HP, IWeapon weapon) {
        super(name, HP, weapon);
    }


    @Override
    public String  attack() {
        return "I am a knight will attack you.";
    }
}
