package Players;


import Weapons.IWeapon;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Fighter extends Player implements IWeapon {

    IWeapon weapon;
    private ArrayList<IWeapon> weapons;

    public Fighter(String name, int HP, IWeapon weapon) {
        super(name, HP);
        this.weapon = weapon;
        this.weapons = new ArrayList<>();
    }

    public IWeapon getWeapon(){
        return this.weapon;
    }

    public void swapWeapon(){
        Collections.shuffle(weapons);
    }
}

