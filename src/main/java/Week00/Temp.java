package Week00;

import static input.InputUtils.*;

public class Temp {
    public static void main(String[] args) {
        // Create a the variables needed to store data for the program
        String currentMonth = "January";
        int dayOfMonth = 11;
        double forecastHigh = 19.4;
        double forecastLow = -3.7;
        // Calculate the difference between the forecast high and forecast low
        double tempDifference = forecastHigh - forecastLow;
        // Combine data to print a message
        System.out.println("On " + currentMonth + " " + dayOfMonth +
               " the difference between the high and low temperatures is " + tempDifference);

    }

    public static class Prices {
        public static void main(String[] args) {
            //Ask user input product name
            String productName = stringInput("What is your product name?");
            //Ask user input product price
            double price = doubleInput("What does " + productName + " cost? ");
            //Ask user input quantity of product
            int quantity = intInput("How many " + productName + " to sell?");
            //calculate total price for this quantity of product
            double totalPrice = price * quantity;
            //print out all data user input
            System.out.println(quantity + " of " + productName + " at $ " + price + " each costs $" + totalPrice);
        }
    }
}
