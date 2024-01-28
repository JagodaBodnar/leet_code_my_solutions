package org.example;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] sArrayChar = s.toCharArray();
        Arrays.sort(sArrayChar);
        String sWord = String.valueOf(sArrayChar);
        char[] tArrayChar = t.toCharArray();
        Arrays.sort(tArrayChar);
        String tWord = String.valueOf(tArrayChar);
        return sWord.equals(tWord);
    }
}
