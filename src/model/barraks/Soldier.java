package model.barraks;

import model.armory.AssaultRifle;
import model.armory.Rifle;
import model.armory.SniperRifle;
import control.wrappers.RandomWrapper;

public class Soldier {
    private final Rifle rifle = RandomWrapper.getBoolean() ? new AssaultRifle() : new SniperRifle();
    private final String id;
    private Integer health;

    public Soldier(String id) {
        this.id = id;
        health = 100;
    }

    public int attack(Soldier soldier){
        if (rifle instanceof SniperRifle){
            if (RandomWrapper.getBoolean()) {
                rifle.onHit(soldier);
            } else {
                ((SniperRifle) rifle).zoomHit(soldier);
            }
        } else {
            rifle.onHit(soldier);
        }
        return this.health;
    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+'{'+"Health="+health+" Rifle"+rifle+'}';
    }
}
