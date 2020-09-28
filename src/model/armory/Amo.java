package model.armory;

public enum Amo {

    cal7(10, -10),
    cal5(0, 15);

    private final Integer damage;
    private final Integer accuracy;

    Amo(Integer damage, Integer accuracy) {
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public int getDamage() {
        return damage;
    }

    public int getAccuracy() {
        return accuracy;
    }
}
