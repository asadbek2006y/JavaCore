package Hashmap;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> ageMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        // Retrieve values using keys
        System.out.println("Alice's age: " + ageMap.get("Alice"));  // Output: 30
        System.out.println("Bob's age: " + ageMap.get("Bob"));      // Output: 25

        // Remove a key-value pair
        ageMap.remove("Charlie");

        // Check if a key exists
        System.out.println("Contains Alice? " + ageMap.containsKey("Alice"));  // Output: true
    }
}
