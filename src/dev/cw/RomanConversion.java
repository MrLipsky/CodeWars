package dev.cw;

public class RomanConversion {

    public static void main(String[] args) {
        System.out.println(solution(3999));
        System.out.println(solution(2023));
        System.out.println(solution(1990));
        System.out.println(solution(1666));
        System.out.println(solution(0));
        System.out.println(solution(3843));
        System.out.println(solution(1244));
    }

//    Method to converse arabic numerals to roman numerals
    public static String solution(int n) {
        if (0 <= n && n <= 3999) {
            StringBuilder romanNumber = new StringBuilder();
            while (n >= 1000) {
                romanNumber.append("M");
                n -= 1000;
            }
            if (n >= 900) {
                romanNumber.append("CM");
                n -= 900;
            }
            if (n >= 500) {
                romanNumber.append("D");
                n -= 500;
            }
            if (n >= 400) {
                romanNumber.append("CD");
                n -= 400;
            }
            while (n >= 100) {
                romanNumber.append("C");
                n -= 100;
            }
            if (n >= 90) {
                romanNumber.append("XC");
                n -= 90;
            }
            if (n >= 50) {
                romanNumber.append("L");
                n -= 50;
            }
            if (n >= 40) {
                romanNumber.append("XL");
                n -= 40;
            }
            while (n >= 10) {
                romanNumber.append("X");
                n -= 10;
            }
            if (n == 9) {
                romanNumber.append("IX");
                return romanNumber.toString();
            }
            if (n >= 5) {
                romanNumber.append("V");
                n -= 5;
            }
            if (n == 4) {
                romanNumber.append("IV");
                return romanNumber.toString();
            }
            while (n > 0) {
                romanNumber.append("I");
                n -= 1;
            }
            return romanNumber.toString();
        }
        return null;

    }
}
