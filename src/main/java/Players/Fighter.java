package Players;


import Weapons.IWeapon;

public abstract class Fighter extends Player implements IWeapon {

    IWeapon weapon;

    public Fighter(String name, int HP, IWeapon weapon) {
        super(name, HP);
        this.weapon = weapon;
    }

}

