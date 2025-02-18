package Week01;

import static input.InputUtils.*;

public class HelloInput {
    public static void main(String[] args) {
        //Ask user input name
        String name = stringInput("Please enter your name");
        //print out user's name
        System.out.println("Hello " + name + "!");
        //Ask user input a number
        int candyBars = intInput("How many candy bars?");
        // As above, but checks number is positive
        int people = positiveIntInput("How many people?");
        double price = doubleInput("What is the price of the item?");
        // As above but checks number is positive
        double length = positiveDoubleInput("How long is the string?");
        // User can type "y" or "n" or "yes" or "no" or any of these in uppercase
        boolean ok = yesNoInput("OK to continue?");
        //Another way for stringInput
        System.out.println("What is your name?");
        String data = stringInput();
    }
}
