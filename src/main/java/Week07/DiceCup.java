package Week07;

import java.util.ArrayList;

public class DiceCup {
    private ArrayList<Dice> allDice; // All the Dice objects
    DiceCup(int numberOfDice) {
        allDice = new ArrayList<>();
        for (int d = 0; d < numberOfDice; d++) {
            Dice dice = new Dice();
            allDice.add(dice);
        }
    }
// Rolls all the dice, adds the values and returns the total
    public int rollAll() {
        int total = 0;
        for (Dice d: allDice) {
            int diceRoll = d.roll();
            total += diceRoll;
        }
        return total;
    }
}
