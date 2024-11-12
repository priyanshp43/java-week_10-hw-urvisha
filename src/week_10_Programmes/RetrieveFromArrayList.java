package week_10_Programmes;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class RetrieveFromArrayList {

    public static void main(String[] args) {
        // Create a new Array list
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the Array List
        colors.add("Red");
        colors.add("BLack");
        colors.add("Green");
        colors.add("White");

        // Specify the index to retrieve
        int indexToRetrieve = 2;

        // Retrieve and print the element at the specified index
        if (indexToRetrieve >= 0 && indexToRetrieve < colors.size()) {
            String color = colors.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + color);
        } else {
            System.out.println("Invalid index. Please enter a valid index between 0 and " + (colors.size() - 1));
        }
    }


}


