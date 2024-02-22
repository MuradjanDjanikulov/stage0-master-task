package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }

        if (isValidMonth(month)) {
            int daysInMonth = getDaysInMonth(year, month);
            if (daysInMonth != -1) {
                System.out.println(daysInMonth);
            } else {
                System.out.println("invalid month");
            }
        } else {
            System.out.println("invalid date");
        }
    }

    private boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // Invalid month
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
