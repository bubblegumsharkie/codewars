package org.bubblegumsharkie.codewars.kyu4.RomanNumerals;

import java.util.ArrayList;

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
        ArrayList<Character> romanNumeralChar = new ArrayList<>();
        romanNumeralChar.add(' ');
        for (char c : romanNumeral.toCharArray()
        ) {
            romanNumeralChar.add(c);
        }
        romanNumeralChar.add(' ');
        int year = 0;
        for (int i = 0; i < romanNumeralChar.size(); i++) {
            if (romanNumeralChar.get(i) == 'M') year += 1000;
            if (romanNumeralChar.get(i) == 'D') year += 500;
            if (romanNumeralChar.get(i) == 'C') year += 100;
            if (romanNumeralChar.get(i) == 'L') year += 50;
            if (romanNumeralChar.get(i) == 'X') year += 10;
            if (romanNumeralChar.get(i) == 'V' && romanNumeralChar.get(i - 1) != 'I') year += 5;
            if (romanNumeralChar.get(i) == 'V' && romanNumeralChar.get(i - 1) == 'I') year += 4;
            if (romanNumeralChar.get(i) == 'I' && romanNumeralChar.get(i - 1) == 'V' && romanNumeralChar.get(i + 1) != 'V') {
                year += 1;
            } else if (romanNumeralChar.get(i) == 'I' && romanNumeralChar.get(i - 1) != 'V') {
                year += 1;
            }

//            if (romanNumeralChar.get(i) == 'V' && i + 1 < romanNumeralChar.size() && romanNumeralChar.get(i + 1) != 'I')
//                year += 5;
//            if (romanNumeralChar.get(i) == 'V' && i + 1 < romanNumeralChar.size() && romanNumeralChar.get(i + 1) == 'I')
//                year += 4;
//            if (romanNumeralChar.get(i) == 'I' && i + 1 < romanNumeralChar.size() && romanNumeralChar.get(i - 1) != 'V')
//                year += 1;
        }
        return year;
    }

}
