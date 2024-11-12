package week_10_Programmes;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class ArrayListTest {
    public static void main(String[] args) {

        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Test if Arraylist empty or not
        if (colors.isEmpty()) {
            System.out.println("The arraylist is empty");
        } else {
            System.out.println("The array list is not empty");
        }

        // Add some colors to the array list
        colors.add("White");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Purple");

        // Test again if array list is empty
        if (colors.isEmpty()) {
            System.out.println("The array list is empty");
        } else {
            System.out.println("The array list is not empty");
        }
    }
}


