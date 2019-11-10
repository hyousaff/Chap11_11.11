// Hamza Yousaf
// Exercise 11.11 Chap 11
// Ask user for 5 numbers and display them in increasing order using the SortArrayList

import java.util.Scanner;
import java.util.ArrayList;


// main class
public class SortArrayList {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Prompt the user to enter 5 numbers
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // Sort numbers
        sort(list);

        // Display list in increasing order
        System.out.println(list.toString());
    }

    /** Sorts an ArrayList of Integers */
    public static void sort(ArrayList<Integer> list) {
        java.util.Collections.sort(list);
    }
    }

