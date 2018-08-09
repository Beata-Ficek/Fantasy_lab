package Weapons;

public class Ax implements IWeapon{

    private int damageValue;

    public Ax(int damageValue){
        this.damageValue = damageValue;
    }

    @Override
    public int attack() {
        return this.damageValue;

    }
}
