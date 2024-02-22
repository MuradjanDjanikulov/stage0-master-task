package com.epam.loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = 1;

        // Multiply the base number with itself 'power' times
        for (int i = 1; i <= power; i++) {
            result *= numberToPrint;
        }

        // Print the result
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}

