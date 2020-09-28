package model.armory;

import control.wrappers.RandomWrapper;
import model.barraks.Soldier;

public class SniperRifle extends Rifle {

    public SniperRifle() {
        super(20, 60);
    }

    public void zoomHit(Soldier soldier) {
        int zoomAccuracy= RandomWrapper.getBoundInteger(15-5+1)+5;
        if(RandomWrapper.getBoundInteger(100)<=getAccuracy()+zoomAccuracy){
            soldier.setHealth(soldier.getHealth()-getDamage());
        }
    }


}
