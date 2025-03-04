package Week02;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {
        // An array with the names of each day of the week, used to create questions for the user
        String[] dayNames = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double total = 0; // Will add each day's expenses to this variable to calculate the week's total
        for (int day = 0; day < dayNames.length; day++) { // Loop 7 times, once for each day of the week
            String dayName = dayNames [day];
            double dayExpense = doubleInput("On "+ dayName + ", what did you spend on bus fares?");
            total = total + dayExpense; // add the day's expense to the total
        }
        System.out.println("For the week, you spent $" + total +" for bus fares.");
    }
}
