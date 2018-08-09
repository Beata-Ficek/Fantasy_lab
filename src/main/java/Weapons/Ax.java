package Weapons;

public class Ax implements IWeapon{

    private int damageValue;

    public Ax(int damageValue){
        this.damageValue = damageValue;
    }

    @Override
    public String attack() {
        return "I will cut you in half";

    }

    public int getDamageValue(){
        return this.damageValue;
    }
}
