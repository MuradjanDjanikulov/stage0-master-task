package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public static void printTable(int numberTableToPrint) {
        // Check if the entered number is positive
        if (numberTableToPrint < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + (numberTableToPrint * i));
        }
    }
}

