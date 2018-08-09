package Players;

import Weapons.IWeapon;

public class Barbarian extends Fighter{

    public Barbarian(String name, int HP, IWeapon weapon) {
        super(name, HP, weapon);
    }

    @Override
    public int attack() {
        return 0;
    }
}
