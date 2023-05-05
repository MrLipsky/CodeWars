package dev.cw;

public class TenMinWalk {

    public static void main(String[] args) {

        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        System.out.println(isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        System.out.println(isValid(new char[] {'w'}));
        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));

    }

//    Method to check if the walk will take you exactly ten minutes
//    and will, return you to your starting point
    public static boolean isValid(char[] walk) { // Method to check if walk is 10 minutes and valid
        int vertical = 0;
        int horizontal = 0;
        int counter = 0;
        for (char c : walk) {
            counter++;
            switch (c) {
                case 'n' -> vertical--;
                case 's' -> vertical++;
                case 'e' -> horizontal--;
                case 'w' -> horizontal++;
            }
        }
        return vertical == 0 && horizontal == 0 && counter == 10;
    }
}
