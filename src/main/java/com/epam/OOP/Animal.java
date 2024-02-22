package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawString = (numberOfPaws == 1) ? "paw" : "paws";
        String furString = (hasFur) ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawString + " and " + furString + " fur.";
    }
}

