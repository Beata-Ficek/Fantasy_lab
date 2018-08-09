package Players;

import Defenders.IDefend;
import Players.Player;
import Spells.ISpell;

public abstract class Mage extends Player implements IDefend, ISpell {

    private int defendValue;

    public Mage(String name, int HP, int defendValue) {
        super(name, HP);
        this.defendValue = defendValue;
    }

    public int getDefendValue(){
        return this.defendValue;
    }

//    @Override
//    public String defend() {
//        return null;
//    }
}
