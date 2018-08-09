package Players;


import Weapons.IWeapon;

public class Dwarf extends Fighter {


    public Dwarf(String name, int HP, IWeapon weapon) {
        super(name, HP, weapon);
    }

    @Override
    public int attack() {
        return 0;
    }
}
