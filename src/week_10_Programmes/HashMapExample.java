package week_10_Programmes;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();

        //Add some key-value pairs to the HashMap
        people.put("John", 30);
        people.put("Jane", 25);
        people.put("Jim", 35);
        people.put("Jill", 28);

        //  Iterate through the values in the HashMap using a for-each loop
        System.out.println("Ages of people in the HashMap:");
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



