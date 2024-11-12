package week_10_Programmes;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class ColorList {

    public static void main(String[] args) {
        // Create a new array list
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the array list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Print out the collection using a for-each loop
        System.out.println("Color List:");
        for (String color : colors) {
            System.out.println(color);
        }

    }

}
