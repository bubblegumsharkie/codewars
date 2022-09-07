package org.bubblegumsharkie.codewars.kyu4.RomanNumerals;

public class RomanNumerals {
    public static String toRoman(int n) {
        int currentN = n;
        StringBuilder stringBuilder = new StringBuilder();

        while (currentN >= 1000) {
            stringBuilder.append("M");
            currentN -= 1000;
        }
        while (currentN >= 500) {
            stringBuilder.append("D");
            currentN -= 500;
        }

        while (currentN >= 100) {
            stringBuilder.append("C");
            currentN -= 100;
        }

        while (currentN >= 50) {
            stringBuilder.append("L");
            currentN -= 50;
        }

        while (currentN >= 10) {
            stringBuilder.append("X");
            currentN -= 10;
        }

        while (currentN >= 5) {
            stringBuilder.append("V");
            currentN -= 5;
        }

        while (currentN == 4) {
            stringBuilder.append("IV");
            currentN -= 4;
        }

        while (currentN >= 1) {
            stringBuilder.append("I");
            currentN -= 1;
        }

        System.out.println("Current N = " + currentN);

        return stringBuilder.toString();
    }

    public static int fromRoman(String romanNumeral) {
        return 1;
    }
}
