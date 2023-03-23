package org.bubblegumsharkie.codewars.kyu5.simplepiglatin;

import static java.lang.Character.isAlphabetic;

public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder result = new StringBuilder();

        for (String s : str.split(" ")) {
            char firstLetter = s.charAt(0);

            result.append(s, 1, s.length())
                    .append(firstLetter)
                    .append(isAlphabetic(firstLetter) ? "ay" : "")
                    .append(" ");
        }
        return result.substring(0, result.length()-1);
    }
}
