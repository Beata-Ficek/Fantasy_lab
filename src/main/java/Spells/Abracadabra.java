package Spells;

public class Abracadabra implements ISpell{
    private int powerValue;

    public Abracadabra(int powerValue){
        this.powerValue = powerValue;

    }

    public int getPowerValue() {
        return powerValue;
    }


    @Override
    public String cast() {
        return "Abracadabra, you loose: " + this.powerValue;
    }
}
