package Week02;

public class Loops {
    public static void main(String[] args) {
        // Create and initialize a loop counter, start = 0,end= 9, increment= 1
        for (int x = 0 ; x < 10; x++) {
            System.out.println(x);
        }
        // Create and initialize a loop counter, start = 0,end= 9, increment= 2
        for (int x = 0 ; x < 10 ; x = x + 2) {
            System.out.println(x);
        }
        // Create and initialize a loop counter, start = 10,end= 95, increment= 5
        for (int x = 10 ; x < 100 ; x = x + 5) {
            System.out.println(x);
        }
        // Create and initialize a loop counter, start = 5,end= 0, decrement= 1
        for (int x = 5 ; x >= 0 ; x = x - 1) {
            System.out.println(x);
        }
        // Create and initialize a loop counter, start = 5,end= 0, decrement= 1
        for (int x = 5 ; x >= 0 ; x-- ) {
            System.out.println(x);
        }
        // Create and initialize a loop counter, print all day in January
        System.out.println("Here are all the date in January");
        for (int day = 1 ; day <= 31 ; day++) {
            // Add st if day = 1,21 or 31
            if (day % 10 ==1) {
                System.out.println("January " + day + "st");
            }
            // Add nd if day = 2 or 22
            else if (day % 10 == 2) {
                System.out.println("January " + day + "nd");
            }
            // Add rd if day = 3 or 23
            else if (day % 10 == 3) {
                System.out.println("January " + day + "rd");
            }
            // Add th for all day left
            else{
                System.out.println("January " + day + "th");
            }
        }
        // Use a loop to calculate and print the mileages for the next 8 oil changes, start from miles 15000, oil change interval 3000
        int miles = 150000;
        int oilChangeInterval = 3000;
        for (int oilChange = 0 ; oilChange < 8 ; oilChange++) {
            // calculate miles each oil change
            miles += oilChangeInterval;
            System.out.println(miles);
        }
        // display the square of *
        // the outer loop print one row per loop repeat
        for (int x = 0 ;x < 5 ; x++){
            // inner for loop. For each row, print a star 5 times
            for (int y = 0 ; y < 5 ; y++){
                // System.out.print - not System.out.println. This doesn't add the new line at the end of output
                System.out.print("* ");
            }
            // then move to next line
            System.out.println();
        }
    }
}
