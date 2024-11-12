package week_10_Programmes;

import java.util.ArrayList;
import java.util.List;

/**
 * Declare two arrylist and compare it.
 */

public class CpmpareArrayList {

    public static void main(String[] args) {
        // Declare and initialize the first ArrayList
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Declare and initialize the second ArrayList
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the two ArrayLists and print the result
        System.out.println("Comparison result of c1 and c2:");
        List<String> comparisonResult = new ArrayList<String>();
        for (String element : c1) {
            comparisonResult.add(c2.contains(element) ? "Yes" : "No");
        }
        System.out.println(comparisonResult);
    }

}
