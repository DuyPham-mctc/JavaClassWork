package Week03;

public class StringFormatLeftAlign {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November"};
        double[] bills = {230.0,240.0,180.0,100.0,80,30,30,30,50,80,200,250};
        // Can specify the minimum number of characters to be displayed. In this ca
        // format the String using a minimum of 15 characters
        // The sign means left-align.
        System.out.println(String.format("%-15s %-15s", "Month", "Bill"));
        System.out.println("______________________");
        for (int month = 0; month < months.length; month++) {
        // Format String in minimum of 15 characters and align left. Note use c
        // format double in a minimum of 15 characters with 2 decimal places, a
        System.out.println(String.format("%-15s %-15.2f", months [month], bills[month]));
        }
    }
}
