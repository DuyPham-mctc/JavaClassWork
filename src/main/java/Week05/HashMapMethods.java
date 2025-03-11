package Week05;

import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        //Create a new HashMap
        Map<String, String> h = new HashMap<>();
        //Add some test data. The class codes are the keys, the class names are the values
        h.put("1100", "Info Tech Concepts");
        h.put("1110", "Info Tech Skills");
        h.put("1150", "Programming Logic");
        h.put("1250", "Windows");
        h.put("1425", "Data Communications");
        // printing a HashMap. Note the order of keys is not the same as the order the key-value pairs were added
        System.out.println(h);
        // {1425=Data Communications, 1100=Info Tech Concepts, 1110=Info Tech Skills, 1250=Windows, 1150-Programming Logic}
        System.out.println("The value for the key 1150 is "+ h.get("1150"));
        System.out.println("The value for the key 1999 is "+ h.get("1999")); // null, not error
        System.out.println("Does HashMap contain the key 1100? "+ h.containsKey("1100")); // true
        System.out.println("Is this HashMap empty? "+ h.isEmpty()); // false
        System.out.println("How many key value pairs?" + h.size()); // 5
        System.out.println("Is there an entry with the value \"Windows\"? "+ h.containsValue("Windows")); // true
        System.out.println("Delete the 1250 key-value pair by key. The value is "+ h.remove("1250")); // "Data Communications"
        System.out.println("Delete a key that doesn't exist, what does this return? "+ h.remove("1724")); // null
        // loops and hashmaps
        for (String classNumber: h.keySet()) {
            //Use the key to get each value. Repeat for each key.
            System.out.println("Class Number = "+ classNumber +" Class Name "+ h.get(classNumber));
        }
        System.out.println("\nPrinting out all values using a loop\n");
        for (String value: h.values()) {
            System.out.println(value);
        }
        System.out.println("\nA loop for both keys and values\n");
        for (Map. Entry<String, String> entry: h.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        // Creates an immutable map - you can't change the keys or values
        Map electricCars = Map.of("Leaf", "Nissan", "Model S", "Tesla", "Mirai", "Toyota");
        Map ninjaTurtleMaskColors = Map.of("Leonardo", "blue", "Donatello", "purple", "Raphael", "red", "Michelangelo", "orange");
        Map itecClassroomComputers = Map.of("T.3010", "PC", "T.3020", "PC", "T.3030", "PC", "T.3040", "Mac", "T.3050", "PC", "T.3080", "PC");
        // In Java, you can use newlines to aid readability
        Map<String, Integer> distanceFromMinneapolis = Map.of(
                "Duluth", 154,
                "Brainerd", 127,
                "Stillwater", 26,
                "Ely", 245,
                "Red Wing", 54);
    }
}
