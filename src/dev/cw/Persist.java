package dev.cw;

import java.util.LinkedList;

public class Persist {

    public static void main(String[] args) {

        System.out.println(persistence(39));
        System.out.println(persistence(999));
        System.out.println(persistence(4));
    }

    // Method to count how many times you have
    // to multiply digits of a number to get
    // single digit number
    public static int persistence(long n) {
        int counter = 0;
        while (n >= 10) {
            LinkedList<Integer> stack = new LinkedList<>();
            while (n > 0) {
                stack.push((int)n % 10);
                n /= 10;
            }
            int multiplicatedDigits = 1;
            for (int i : stack) {
                multiplicatedDigits *= i;
            }
            n = multiplicatedDigits;
            counter++;
        }
        return counter;
    }
}
