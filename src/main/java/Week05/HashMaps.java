package Week05;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        // Create HashMap for String keys, and Double values
        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1); // Add key = January with value = 3.1.
        snowfall.put("February", 10.8); // Add key = February with value = 10.8
        System.out.println(snowfall); // {January=3.1, February=10.8}
        snowfall.put("January", 4.6); // Update January snow
        System.out.println(snowfall); // {January=4.6, February=10.8} Old value was overwritten
        // Values can be any type - Integer, Boolean, arrays, Lists, other HashMaps...
        Map<String, Integer> quantitiesOfProducts = new HashMap<>();
        Map<String, double[]> carsDailyMilesDriven = new HashMap<>();
        Map<Integer, Boolean> serialNumbersAccountedFor = new HashMap<>();
        Map<String, List<Double>> runTimesForRoute = new HashMap<>();
    }
}
