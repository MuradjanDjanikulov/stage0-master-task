package com.epam.loops;
public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print leading spaces
            for (int j = cathetusLength - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print ascending numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Print descending numbers (excluding 1 for the first row)
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(6);
    }
}
