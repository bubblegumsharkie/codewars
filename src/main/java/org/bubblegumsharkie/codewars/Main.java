package org.bubblegumsharkie.codewars;

import org.bubblegumsharkie.codewars.kyu4.RomanNumerals.RomanNumerals;

public class Main {

    public static void main(String[] args) {
        System.out.println(RomanNumerals.toRoman(1666));
        System.out.println(RomanNumerals.toRoman(2008));
        System.out.println(RomanNumerals.toRoman(4008));
        System.out.println(RomanNumerals.toRoman(1));
        System.out.println(RomanNumerals.toRoman(9));

        System.out.println(RomanNumerals.fromRoman("MDCLXVI"));
        System.out.println(RomanNumerals.fromRoman("MMVIII"));
        System.out.println(RomanNumerals.fromRoman("MMMMVIII"));
        System.out.println(RomanNumerals.fromRoman("I"));
        System.out.println(RomanNumerals.fromRoman("VIV"));
    }
}