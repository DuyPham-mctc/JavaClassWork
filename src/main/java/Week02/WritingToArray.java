package Week02;

import static input.InputUtils.stringInput;
import java.util.Arrays;

public class WritingToArray {
    public static void main(String[] args) {
        //Create an array to store 5 Strings
        String[] textbooks = new String [5];
        // Loop repeat 5 times. Notice the loop counter variable 'number'
        // counts from 0, 1, 2, 3, 4 this is the same as the array element numbers
        // So, we can use the variable number to refer to each array element in turn
        // Can use a loop to read from, or write to, every array element in turn
        for (int number = 0; number < textbooks.length; number++) {
            //Get data about one book from the user
            String bookName = stringInput("Please enter name of textbook");
            // Using the loop counter to write to each array element in turn
            textbooks [number] = bookName;
        }
        System.out.println("Thank you: here is the data you entered");
        System.out.println(Arrays.toString(textbooks));
    }
}
