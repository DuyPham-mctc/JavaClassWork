package Week03;

import static input.InputUtils.intInput;

public class CreditsToGraduate {
    public static void main(String[] args) {
        int creditsEarned = intInput("How many credits have you earned?");
        int creditsNeeded = intInput("How many credits does your program require?");
        int creditsToGraduate = howManyCreditsToGraduate(creditsNeeded, creditsEarned);
        System.out.printf("You need %d credits to graduate. You've got this!", creditsToGraduate);
    }
    private static int howManyCreditsToGraduate (int creditsNeeded, int creditsEarned) {
        return creditsNeeded - creditsEarned;
    }
}
