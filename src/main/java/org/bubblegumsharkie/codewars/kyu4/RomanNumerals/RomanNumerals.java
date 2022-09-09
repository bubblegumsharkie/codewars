package org.bubblegumsharkie.codewars.kyu4.RomanNumerals;

import java.util.ArrayList;
import java.util.TreeMap;

public class RomanNumerals {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }
    public static String toRoman(int n) {
        int l =  map.floorKey(n);
        if ( n == l ) {
            return map.get(n);
        }
        return map.get(l) + toRoman(n-l);
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
            if (romanNumeralChar.get(i) == 'X' && romanNumeralChar.get(i - 1) != 'I') {
                year += 10;
            } else if (romanNumeralChar.get(i) == 'X' && romanNumeralChar.get(i - 1) == 'I') {
                year += 9;
            }
            if (romanNumeralChar.get(i) == 'V' && romanNumeralChar.get(i - 1) != 'I') year += 5;
            if (romanNumeralChar.get(i) == 'V' && romanNumeralChar.get(i - 1) == 'I') year += 4;
            if (romanNumeralChar.get(i) == 'I' && romanNumeralChar.get(i - 1) == 'V' && romanNumeralChar.get(i + 1) != 'V') {
                year += 1;
            } else if (romanNumeralChar.get(i) == 'I' && romanNumeralChar.get(i - 1) != 'V'&& romanNumeralChar.get(i + 1) != 'X') {
                year += 1;
            }
        }
        return year;
    }


}
