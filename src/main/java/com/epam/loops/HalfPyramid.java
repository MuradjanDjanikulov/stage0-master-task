package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print leading spaces
            for (int j = cathetusLength - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(5);
    }
}

