package week_10_Programmes;

/**
 * Write a Java program to iterate through all elements in an array list using
   Iterater.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ElementsWithIterator {
    public static void main(String[] args) {
        // Create a new array list
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the array list
        colors.add("Black");
        colors.add("Pink");
        colors.add("Violet");
        colors.add("Yellow");
        colors.add("Purple");

        // Get an iterator for the array list
        Iterator<String> iterator = colors.iterator();

        // Iterate through the array list using the iterator
        System.out.println("Iterating through the Color List:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }
}
