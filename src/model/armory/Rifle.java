package model.armory;


import control.wrappers.RandomWrapper;
import model.barraks.Soldier;

public abstract class Rifle {
    private final Integer damage;
    private final Integer accuracy;
    private final Amo amo = RandomWrapper.getBoolean() ? Amo.cal5 : Amo.cal7;

    public Rifle(int damage, int accuracy) {
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public void onHit(Soldier soldier) {
        if(RandomWrapper.getBoundInteger(100)<=getAccuracy()) {
            soldier.setHealth(soldier.getHealth() - getDamage());
        }
    }

    public int getAccuracy() {
        return accuracy + amo.getAccuracy();
    }

    public int getDamage() {
        return damage+amo.getDamage();
    }

    @Override
    public String toString() {
        return this.getClass().getName()+amo.name();
    }
}
