package Week04;

import java.util.ArrayList;
import java.util.List;

public class ListFunctions {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Boolean> results = new ArrayList<>();
        List<Double> prices = new ArrayList<>();
        numbers.add(100);// Add int value
        // Add some more ints
        numbers.add(5);
        numbers.add(42);
        numbers.add(71);
        numbers.add(201);
        numbers.add(22);
        System.out.println(numbers);// [100, 5, 42, 71, 201, 22]

        List<String> vehicles = new ArrayList<>();
        vehicles.add("Bus"); // Adds to end of list [Bus]
        vehicles.add("Car");// Adds to end of list [Bus, Car]
        // Add to start of list
        vehicles.add(0, "Train");// [Train, Bus, Car]
        vehicles.add(0, "Boat");// [Boat, Train, Bus, Car]
        // Add to list at position 2. The elements starting at position 2 move up one.
        vehicles.add(2, "Airplane"); // [Boat, Train, Airplane, Bus, Car]
        // Add to list at position 4. Elements starting at position 4 move up one.
        vehicles.add(4, "Truck"); // [Boat, Train, Airplane, Bus, Truck, Car]
        // Question: what does this do?
        // vehicles.add(20, "Van"); error
        // Does this work?
        System.out.println(vehicles);
        // Question: is ArrayList the best List for adding to the start?
        // Get by index, first element. List is NOT modified
        String firstVehicle = vehicles.get(0);
        System.out.println(firstVehicle); // "Bus"
        System.out.println(vehicles); // [Bus, Car, Train, Boat]
        // Get by index -any index in the list
        String truck = vehicles.get(2);
        System.out.println(truck); // "Train"
        // What will this do?
        // String error = vehicles.get(6);

        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        animals.remove(2);// Removes "Bear", list is [Lion, Tiger]
        animals.remove(0);// removes "Lion", list is [Tiger]
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Frog");
        animals.remove("Frog");// List is now [Tiger, Cat, Bird]
        animals.remove("Zebra");// No effect on list
        animals.set(2, "Panther"); //List is now [Tiger, Cat, Panther]
        //animals.set(4, "Cheetah"); //error
        if (animals.contains("Bear")) {
            System.out.println("The list contains a bear");
        } else {
            System.out.println("No bear in this list");
        }
        int numberOfAnimals = animals.size();
        System.out.println("There are "+ numberOfAnimals +" animals in the list.");
        // Remove everything
        animals.clear();
        System.out.println(animals); // []

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        System.out.println(animals);// [Lion, Tiger, Bear]
        System.out.println("Is the list empty? "+ animals.isEmpty());// false
        // Remove everything
        animals.clear();
        System.out.println(animals);// []
        System.out.println("Is the list empty? "+ animals.isEmpty());// true

        List<String> cities = new ArrayList<>();
        cities.add("Minneapolis");
        cities.add("Saint Paul");
        cities.add("Bloomington");
        cities.add("Brooklyn Park");
        cities.add("Golden Valley");
        for (String city: cities) {
            System.out.println(city);
        }
    }
}
