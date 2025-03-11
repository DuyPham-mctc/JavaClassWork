package Week04;

import java.util.ArrayList;
import java.util.List;
import static input.InputUtils.stringInput;

public class UserInput {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();
        while (true) {
            String data = stringInput("Please type a task you need to do, or press Enter to quit");
            if (data.length() == 0) { // If the user just presses Enter, the length of text is 0.
                break;
            }
            todoList.add(data);
        }
        System.out.println("Thank you, here are all of your tasks you entered:");
        for (String input: todoList) {
            System.out.println(input);
        }
    }
}
