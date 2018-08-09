package Enemies;

public abstract class Enemy {

    private int HP;

    public Enemy(int HP){
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int takeDamage(int damage){
        return this.HP - damage;
    }


}
