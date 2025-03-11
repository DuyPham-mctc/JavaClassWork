package Week05;

import java.util.*;
import static input.InputUtils.*;

public class SnowHashMap {
    public static void main(String[] args) {
        Map<String, Double> SnowHashMap = new HashMap<>();
        SnowHashMap.put("March", 4.1);
        SnowHashMap.put("April", 0.0);
        for (String key : SnowHashMap.keySet()) {
            System.out.println(key + " : " + SnowHashMap.get(key));
        }
        // Calculate total snow by adding all the values
        double total = 0;
        // Loop over all the values in the HashMap
        for (Double snow: SnowHashMap.values()) {
            total += snow;
        }
        System.out.println("Total snowfall is "+ total +" inches.");
        // Check if key exists before adding
        String newMonth = stringInput("Enter month: ");
        double newSnow = positiveDoubleInput("Enter snow for " + newMonth);
        boolean overwrite = true;
        if (SnowHashMap.containsKey(newMonth)) {
            double snow = SnowHashMap.get(newMonth);
            System.out.println(newMonth + " is already in the HashMap");
            System.out.println("Snowfall for "+ newMonth +" was "+ snow +" inches.");
            overwrite = yesNoInput("Do you want to overwrite the old data?");
        }
        if (overwrite) {
            SnowHashMap.put(newMonth, newSnow);
        } else {
            System.out.println("HashMap was not modified.");
        }
    }
}
