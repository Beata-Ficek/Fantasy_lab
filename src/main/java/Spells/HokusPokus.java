package Spells;

public class HokusPokus implements ISpell{
    private int powerValue;

    public HokusPokus(int powerValue){
        this.powerValue = powerValue;
    }

    public int getPowerValue() {
        return powerValue;
    }

    @Override
    public String cast() {
        return "HokusPokus CzaryMary, you loose :" + this.powerValue;
    }
}
