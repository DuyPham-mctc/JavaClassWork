package Week07;

import java.util.Random;

public class Dice {
    private Random rnd = new Random();
    int roll() {
        return rnd.nextInt(6) + 1;
    }
}
