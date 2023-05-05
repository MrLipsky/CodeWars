package dev.cw;

import java.util.Arrays;
import java.util.Objects;

public class TwoToOne {

    public static void main(String[] args) {

        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
        System.out.println(longest("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"));

    }

//    Method takes two strings s1 and s2 including only letters from a to z.
//    Returns a new sorted string, the longest possible,
//    containing distinct letters - each taken only once - coming from s1 or s2.
    public static String longest (String s1, String s2) {
        if (!Objects.equals(s1, s2)) {
            s1 += s2;
        }
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        StringBuilder stringsCombined = new StringBuilder();
        for (char c : charArray) {
            if (stringsCombined.toString().indexOf(c) == -1) {
                stringsCombined.append(c);
            }
        }
        return stringsCombined.toString();
    }
}
