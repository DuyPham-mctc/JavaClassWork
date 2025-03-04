package Week01;

import static input.InputUtils.*;

public class PasswordCheck {
    public static void main(String[] args) {
        String userPassword = stringInput("Enter the password");
        // Always use the equals method to check if two Strings have the exact same characters
        if (userPassword.equals("qwerty") ) {
            System.out.println("Welcome, authorized user");
        } else {
            System.out.println("Access denied!");
        }
    }
}
