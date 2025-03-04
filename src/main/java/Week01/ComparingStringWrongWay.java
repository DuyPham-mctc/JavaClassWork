package Week01;

import static input.InputUtils.*;

public class ComparingStringWrongWay {
    public static void main(String[] args) {
        String college = stringInput("Which college do you attend?");
        //This line does not do as you might expect!
        if (college == "MCTC") {
            System.out.println("Yay, MCTC!");
        }
        //This line does work as expected!
        if (college.equals("MCTC")) {
            System.out.println("Yay, MCTC!");
        } else {
            System.out.println("Too bad, you should go to MCTC!");
        }
    }
}
