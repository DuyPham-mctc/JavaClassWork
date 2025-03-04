package Week01;

import static input.InputUtils.intInput;

public class NumberQuizBasic {
    public static void main(String[] args) {
        int secretNumber = 6;
        int guess = intInput("Guess the number I am thinking of");
        if (guess == secretNumber) {
            //If the guess is equal to secret number, the user guessed correctly
            System.out.println("You guessed correctly!");
        } else if (guess - secretNumber == 1) {
            System.out.println("Your guess is 1 too high!");
        } else if ( secretNumber - guess == 1) {
            System.out.println("Your guess is 1 too low!");
        } else {
            //else, they did not guess correctly. Tell them the right answer
            System.out.println("Sorry, I was thinking of "+ secretNumber);
        }
    }
}
