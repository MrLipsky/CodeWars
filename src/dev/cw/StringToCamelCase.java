package dev.cw;

public class StringToCamelCase {

    public static void main(String[] args) {

        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));
    }

    // Method changing input to lower or upper camel case
    // (depending on the first letter)
    static String toCamelCase(String s){
        if (s.isEmpty()) {
            return s;
        }
        boolean isUpperCase = Character.isUpperCase(s.charAt(0));
        boolean isAfterSpace = false;
        String lowerCase = s.toLowerCase();
        char[] stringChars = lowerCase.toCharArray();
        StringBuilder camelCaseString = new StringBuilder();
        for (char c : stringChars) {
            if (isUpperCase) {
                camelCaseString.append(Character.toUpperCase(c));
                isUpperCase = false;
            } else if (isAfterSpace) {
                camelCaseString.append(Character.toUpperCase(c));
                isAfterSpace = false;
            } else if (c == ' ' || c == '-' || c == '_') {
                isAfterSpace = true;
            } else {
                camelCaseString.append(c);
            }
        }
        return camelCaseString.toString();

    }
}
