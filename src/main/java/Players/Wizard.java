package Players;

public class Wizard extends Mage {
    public Wizard(String name, int HP, int defendValue) {
        super(name, HP, defendValue);

    }

    @Override
    public String defend() {
        return "I will defend. You will loose: " + getDefendValue();
    }
}
