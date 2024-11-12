package week_10_Programmes;

import java.util.HashSet;
import java.util.Set;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class HashsetExample {
    public static void main(String[] args) {
        // Create a Hashset to store Integer objects
        Set<Integer> numbers = new HashSet<>();


        // Add numbers to the Set
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);

        // Check which number between 1 to 10 are in the set
        System.out.println("Numbers between 1 to 10 that are in the set:");
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set");
            }

        }

    }
}
