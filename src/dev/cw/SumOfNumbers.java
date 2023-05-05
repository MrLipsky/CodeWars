package dev.cw;

public class SumOfNumbers {

    public static void main(String[] args) {

        System.out.println(GetSum(1, 0));
        System.out.println(GetSum(1, 2));
        System.out.println(GetSum(0, 1));
        System.out.println(GetSum(1, 1));
        System.out.println(GetSum(-1, 0));
        System.out.println(GetSum(-1, 2));
    }

//    Method to find the sum of all integers between
//    and including given numbers
    public static int GetSum(int a, int b)
    {
        if (a != b) {
            int h = Math.max(a, b);
            int l = Math.min(a, b);
            int sum = 0;
            for (int i = l; i <= h; i++) {
                sum += i;
            }
            return sum;
        }
        return a;
    }
}
