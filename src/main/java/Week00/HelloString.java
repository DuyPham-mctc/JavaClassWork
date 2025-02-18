package Week00;

public class HelloString {
    public static void main(String[] args) {
        // Create string variable
        String name = "Duy";
        // Convert string to uppercase
        String nameInUpperCase = name.toUpperCase();
        // Print out string in uppercase
        System.out.println(nameInUpperCase);
        // Convert string to lowercase
        String nameInLowerCase = name.toLowerCase();
        // Print out string in lowercase
        System.out.println(nameInLowerCase);
        // Create int variable number of character in name
        int charactersInName = name.length();
        // Print out int variable number of character in name
        System.out.println("There are " + charactersInName + " characters in your name");
    }
}
