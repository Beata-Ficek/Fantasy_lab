package Defenders;

public class Dragon implements IDefend{

    private int defendValue;

    public Dragon(int defendValue){
        this.defendValue = defendValue;
    }

    @Override
    public String defend() {
        return "I can burn you, you loose" + this.defendValue + "health points";
    }

    public int getDefendValue(){
        return  this.defendValue;
    }
}
