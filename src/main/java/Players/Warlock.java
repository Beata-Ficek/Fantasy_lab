package Players;

import Players.Mage;

public class Warlock extends Mage {

    public Warlock(String name, int HP, int defendValue) {
        super(name, HP, defendValue);
    }


    @Override
    public String defend() {
        return "I will defend. You loose: " + getDefendValue();
    }
}
