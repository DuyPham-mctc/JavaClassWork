package Week01;

import static input.InputUtils.*;

public class Prices {
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
