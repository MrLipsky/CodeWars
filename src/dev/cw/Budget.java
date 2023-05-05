package dev.cw;

public class Budget {

    public static void main(String[] args) {

        System.out.println(find_caterer(150,10));
        System.out.println(find_caterer(1500,60));
        System.out.println(find_caterer(1500,61));
        System.out.println(find_caterer(100,0));
        System.out.println(find_caterer(200,5));
        System.out.println(find_caterer(1000,45));
        System.out.println(find_caterer(940,70));
        System.out.println(find_caterer(100000,6666));
    }

//    Method  takes two arguments denoting the budget in $ and the number of people,
//    returning 1, 2 or 3 depending on which costs maximum and still fits into budget.
    public static int find_caterer(int budget, int people) { // Method to find best caterer
        if (people > 0) {
            if (people > 60 && (0.8 * (people * 30)) <= budget) {
                return 3;
            } else if (people * 30 <= budget) {
                return 3;
            } else if (people * 20 <= budget) {
                return 2;
            } else if (people * 15 <= budget) {
                return 1;
            }
        }
        return -1;
    }
}
