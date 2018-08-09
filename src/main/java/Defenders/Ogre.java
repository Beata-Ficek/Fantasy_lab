package Defenders;

public class Ogre implements IDefend {

    private int defendValue;

    public Ogre(int defendValue){
        this.defendValue = defendValue;
    }

    public int getDefendValue(){
        return  this.defendValue;
    }

    @Override
    public String defend() {
        return "I can EAT you, you loose" + this.defendValue + "health points";
    }
}
