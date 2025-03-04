package Week01;

import static input.InputUtils.*;

public class StringLibraryMethods {
    public static void main(String[] args) {
        String quote = "Java is to JavaScript what Car is to Carpet.";
        //toUpperCase, and toLowerCase
        System.out.println(quote.toUpperCase());
        System.out.println(quote.toLowerCase());
        //replace - replaces one character with another
        String replaced = quote.replace(" ", "#");
        System.out.println(replaced);
        //length what you'd expect
        System.out.println(quote.length());
        //indexof - find position of a character in a string
        //remember count from 0
        System.out.println(quote.indexOf("J"));
        System.out.println(quote.indexOf("C"));
        //contains does one string contain another?
        System.out.println(quote.contains("Java"));
        // Conditions + String Library Methods
        String name = stringInput("Please enter your name");
        if (name.length() > 5) {
            System.out.println("Your name is longer than 5 letters");
        } else {
            System.out.println("Your name is 5 letters or less");
        }
    }
}
