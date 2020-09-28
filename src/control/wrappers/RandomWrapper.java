package control.wrappers;

import java.util.Random;

public class RandomWrapper {
    private static final Random random = new Random();

    private RandomWrapper() {
    }

    public static boolean getBoolean() {
        return random.nextBoolean();
    }

    public static int getBoundInteger(int bound) {
        return Math.abs(random.nextInt(bound));
    }


}
