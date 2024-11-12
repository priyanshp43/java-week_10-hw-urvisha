package week_10_Programmes;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class ReverseIntegerValues {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap the elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
