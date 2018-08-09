package Weapons;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(int damageValue){

        this.damageValue = damageValue;
    }



    @Override
    public String attack() {
        return "I will cut you";
    }

    public int getDamageValue(){
        return  this.damageValue;
    }
}
