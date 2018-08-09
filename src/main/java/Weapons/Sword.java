package Weapons;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(){

        this.damageValue = damageValue;
    }



    @Override
    public int attack() {
        return this.damageValue;
    }
}
