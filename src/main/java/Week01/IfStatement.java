package Week01;

import static input.InputUtils.*;

public class IfStatement {
    public static void main(String[] args) {
        String name = stringInput("Please enter your name");
        System.out.println("Hello + name");
        int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");
        String units = "classes";
        //Check if numberOfClasses == 1
        if (numberOfClasses == 1) {
        units = "class";
        }
        System.out.println("You are taking "+ numberOfClasses + " " + units + " this semester.");
    }
}
